package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private By homeButton = By.cssSelector("header a");
    private By element = By.cssSelector("div.card.mt-4.top-card:nth-child(1)");
    private By form = By.cssSelector("div.card.mt-4.top-card:nth-child(2)");
    private By alertsFrameAndWindows = By.cssSelector("div.card.mt-4.top-card:nth-child(3)");
    private By widgets = By.cssSelector("div.card.mt-4.top-card:nth-child(4)");

    public void goToElem(){
        if(driver.getCurrentUrl().equals("https://demoqa.com")){
            driver.findElement(element).click();
        }else{
            Actions actions = new Actions(driver);
            WebElement home = driver.findElement(homeButton);
            actions.moveToElement(home).click().build().perform();
            driver.findElement(element).click();
        }

    }
    public void goToForms() {
        if(driver.getCurrentUrl().equals("https://demoqa.com")){
            driver.findElement(form).click();
        }else{
            Actions actions = new Actions(driver);
            WebElement home = driver.findElement(homeButton);
            actions.moveToElement(home).click().build().perform();
            driver.findElement(form).click();
        }
    }
    public void goToAlertsFramesAndWindows(){
        if(driver.getCurrentUrl().equals("https://demoqa.com")){
            driver.findElement(alertsFrameAndWindows).click();
        }else{
            Actions actions = new Actions(driver);
            WebElement home = driver.findElement(homeButton);
            actions.moveToElement(home).click().build().perform();
            driver.findElement(alertsFrameAndWindows).click();
        }
    }

    public void goToWidgets() {
        if (driver.getCurrentUrl().equals("https://demoqa.com")) {
            driver.findElement(widgets).click();
        }else{
            Actions actions = new Actions(driver);
            WebElement home = driver.findElement(homeButton);
            actions.moveToElement(home).click().build().perform();
            driver.findElement(widgets).click();
        }
    }
}
