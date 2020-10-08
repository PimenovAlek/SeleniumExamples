package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TextBox{
    WebDriver driver;
    public TextBox(WebDriver driver){
        this.driver = driver;
    }

    By userName = By.cssSelector("input#userName");
    By userEmail = By.cssSelector("input#userEmail");
    By currentAddress = By.cssSelector("textarea#currentAddress");
    By permanentAddress = By.cssSelector("textarea#permanentAddress");
    By submit = By.cssSelector("button#submit");
    By name = By.cssSelector("p#name");



    @Test
    public TextBox fillTextBoxes(){
        driver.findElement(userName).sendKeys("Alex");
        driver.findElement(userEmail).sendKeys("1emam@mail.ma");
        driver.findElement(currentAddress).sendKeys("qwewqeqwewq eqw eqwe qw ewqew12 321 ");
        driver.findElement(permanentAddress).sendKeys("dasdasd sa dasd asd asd asd asd asd as 21 321 3");
        driver.findElement(submit).click();
        driver.findElement(name).getText().contains("Alex");
        return this;
    }


}
