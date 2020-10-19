package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Links {
    WebDriver driver;
    WebDriverWait wait;

    public Links (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait =wait;
    }
    private By simpleLink = By.id("simpleLink");
    private By dynamicLink = By.id("dynamicLink");
    private By homeBanner = By.cssSelector("div.home-banner");


    public void clickOnSimple(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(simpleLink).click();
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
    public void clickOnDynamic(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(dynamicLink).click();
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
