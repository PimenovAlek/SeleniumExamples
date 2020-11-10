package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar {
    WebDriver driver;
    WebDriverWait wait;
    public ProgressBar(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    private By button = By.id("startStopButton");

    public void clickButton(){
        Actions actions = new Actions(driver);
        WebElement btn = driver.findElement(button);
        actions.moveToElement(btn).click().build().perform();
    }
    public String checkButtonName(){
        return driver.findElement(button).getText();
    }
    public void stopProgressBar(int number){
        if(checkButtonName().equals("Stop")){
            By progress = By.cssSelector("div[aria-valuenow='"+number+"']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(progress));
        }else{
            clickButton();
            By progress = By.cssSelector("div[aria-valuenow='"+number+"']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(progress));
        }
        driver.findElement(button).click();

    }
}
