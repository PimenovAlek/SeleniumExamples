package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Accordian {
    WebDriver driver;
    public Accordian(WebDriver driver){
        this.driver =driver;
    }
    private By section1 = By.id("section1Heading");
    private By section2 = By.id("section2Heading");
    private By section3 = By.id("section3Heading");
    private By content1 = By.id("section1Content");
    private By content2 = By.id("section2Content");
    private By content3 = By.id("section3Content");

    public void selectFirst(){
        driver.findElement(section1).click();
        assert driver.findElement(content1).getText().contains("Lorem Ipsum");

    }
    public void selectSecond(){
        driver.findElement(section2).click();
        assert driver.findElement(content2).getText().contains("Richard McClintock");
    }
    public void selectThird(){
        driver.findElement(section3).click();
        assert driver.findElement(content3).getText().contains("will uncover many");

    }
}

