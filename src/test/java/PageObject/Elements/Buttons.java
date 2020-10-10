package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    private WebDriver driver;

    public Buttons(WebDriver driver){
        this.driver = driver;
    }

    private By doubleClickButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    private By clickMe = By.cssSelector("div.mt-4:nth-child(3) button");

    public void doubleClick(){
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClick(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void clickMe(){
        driver.findElement(clickMe).click();
    }

}
