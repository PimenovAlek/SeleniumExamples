package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class BrowserWindows {
    WebDriver driver;
    WebDriverWait wait;
    BrowserWindows(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By tabButton = By.id("tabButton");
    private By anotherWindowText = By.cssSelector("h1");
    private By windowButton = By.id("windowButton");
    private By messageWindowButton = By.id("messageWindowButton");

    public void onTabButton(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(tabButton).click();
        wait.until(numberOfWindowsToBe(2));
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Assert.assertEquals(driver.findElement(anotherWindowText).getText(), "This is a sample page");
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public void openNewWindow(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(anotherWindowText).click();
        wait.until(numberOfWindowsToBe(2));
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Assert.assertEquals(driver.findElement(anotherWindowText).getText(), "This is a sample page");
        driver.close();
        driver.switchTo().window(originalWindow);
    }



}
