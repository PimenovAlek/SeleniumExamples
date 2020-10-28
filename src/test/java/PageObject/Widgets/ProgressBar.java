package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void check(int number){

        assert driver.findElement(button).getText().equals("Start");
        driver.findElement(button).click();
        assert driver.findElement(button).getText().equals("Stop");
        By progress = By.cssSelector("div[aria-valuenow='"+number+"']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(progress));
        driver.findElement(button).click();
        assert driver.findElement(button).getText().equals("Start");
    }
}
