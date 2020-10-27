package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tabs {
    WebDriver driver;
    public Tabs(WebDriver driver){
        this.driver = driver;
    }

    private By what = By.id("demo-tab-what");
    private By whatText = By.id("demo-tabpane-what");
    private By origin = By.id("demo-tab-origin");
    private By originText = By.id("demo-tabpane-origin");
    private By use = By.id("demo-tab-use");
    private By useText = By.id("demo-tabpane-use");
    private By more = By.id("demo-tab-more");


    public String selectWhatTabAndGetText(){
        driver.findElement(what).click();
        return driver.findElement(whatText).getText();
    }
    public String selectOriginTabAndGetText(){
        driver.findElement(origin).click();
        return driver.findElement(originText).getText();
    }
    public String selectUseTabAndGetText(){
        driver.findElement(use).click();
        return driver.findElement(useText).getText();
    }
    public Boolean selectMoreTabAndGetText(){
        return driver.findElement(what).isDisplayed();
    }


}
