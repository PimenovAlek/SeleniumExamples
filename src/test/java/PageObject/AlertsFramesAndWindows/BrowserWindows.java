package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class BrowserWindows {
    WebDriver driver;
    WebDriverWait wait;
    public BrowserWindows(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By tabButton = By.id("tabButton");
    private By anotherWindowText = By.id("sampleHeading");
    private By windowButton = By.id("windowButton");
    private By messageWindowButton = By.id("messageWindowButton");
    private By bodyText = By.xpath("/html/body/text()");

    public void openTab(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(tabButton).click();
        wait.until(numberOfWindowsToBe(2));
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){

                driver.switchTo().window(windowHandle);
                wait.until(ExpectedConditions.visibilityOfElementLocated(anotherWindowText)).getText().equals("This is a sample page");
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public void openNewWindow(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(windowButton).click();
        wait.until(numberOfWindowsToBe(2));
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                wait.until(ExpectedConditions.visibilityOfElementLocated(anotherWindowText)).getText().equals("This is a sample page");
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }
    public void openMessageWindowButton(){
        //Dont work with body in new window content
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;

        driver.findElement(messageWindowButton).click();
        wait.until(numberOfWindowsToBe(2));
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }



}
