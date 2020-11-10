package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Accordian {
    WebDriver driver;
    WebDriverWait wait;
    public Accordian(WebDriver driver, WebDriverWait wait){
        this.driver =driver;
        this.wait = wait;
    }
    private By section1 = By.id("section1Heading");
    private By section2 = By.id("section2Heading");
    private By section3 = By.id("section3Heading");
    private By content1 = By.id("section1Content");
    private By content2 = By.id("section2Content");
    private By content3 = By.id("section3Content");

    public String selectFirst(){
        driver.findElement(section1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(content1));
        return driver.findElement(content1).getText();

    }
    public String selectSecond(){
        driver.findElement(section2).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(content2));
        return driver.findElement(content2).getText();
    }
    public String selectThird(){
        driver.findElement(section3).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(content3));
        return driver.findElement(content3).getText();

    }
}

