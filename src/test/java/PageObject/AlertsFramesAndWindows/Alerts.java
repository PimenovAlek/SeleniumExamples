package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alerts {
    WebDriver driver;
    WebDriverWait wait;

    public Alerts(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmButton = By.id("confirmButton");
    private By promtButton = By.id("promtButton");
    private By confirmResult = By.id("confirmResult");
    private By promptResult = By.id("promptResult");


    public void openAndClose(){
        driver.findElement(alertButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(), "You clicked a button");
        alert.accept();
    }

    public void openAlertWithTimer(){
        driver.findElement(timerAlertButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(), "This alert appeared after 5 seconds");
        alert.accept();
    }

    public void acceptPrompt(){
        driver.findElement(confirmButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.findElement(confirmResult).getText().contains("Ok");

    }
    public void cancelPrompt(){
        driver.findElement(confirmButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        driver.findElement(confirmResult).getText().contains("Cancel");
    }

    public void enterTextIn(String text){
        driver.findElement(promtButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(text);
        alert.accept();
        driver.findElement(promptResult).getText().contains(text);
    }
}
