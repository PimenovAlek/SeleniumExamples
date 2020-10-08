package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class RadioButton {
    WebDriver driver;
    public RadioButton(WebDriver driver){
        this.driver = driver;
    }
    By pageHeader = By.cssSelector("div.main-header");
    By yesRadio = By.cssSelector("label[for='yesRadio']");
    By impressiveRadio = By.cssSelector("label[for='impressiveRadio']");
    By checkResult = By.cssSelector("span.text-success");

    public void checkHeader(){
        String header = driver.findElement(pageHeader).getText();
        Assert.assertEquals(header, "Radio Button");
    }
    public void selectYesRadio(){
        driver.findElement(yesRadio).click();
        String result = driver.findElement(checkResult).getText();
        Assert.assertEquals(result, "Yes");
    }
    public void selectImpressive(){
        driver.findElement(impressiveRadio).click();
        String result = driver.findElement(checkResult).getText();
        Assert.assertEquals(result, "Impressive");
    }

    public void universalWithHelp(Check check){
        if(check.equals(Check.YES)){
            driver.findElement(yesRadio).click();
            String result = driver.findElement(checkResult).getText();
            Assert.assertEquals(result, "Yes");
        }else if(check.equals(Check.IMPRESSIVE)){
            driver.findElement(impressiveRadio).click();
            String result = driver.findElement(checkResult).getText();
            Assert.assertEquals(result, "Impressive");
        }

    }


}
