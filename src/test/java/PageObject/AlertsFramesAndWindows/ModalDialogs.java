package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ModalDialogs {
    WebDriver driver;
    WebDriverWait wait;

    public ModalDialogs(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By showSmallModal = By.id("showSmallModal");
    private By showLargeModal = By.id("showLargeModal");
    private By modalContent = By.cssSelector("div.modal-body");
    private By closeLargeModal = By.id("closeLargeModal");
    private By closeSmallModal = By.id("closeSmallModal");


    public void openSmallModal(){
        driver.findElement(showSmallModal).click();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(modalContent)).getText();
        Assert.assertEquals(text, "This is a small modal. It has very less content");
        driver.findElement(closeSmallModal).click();
    }
    public void openLargeModal(){
        driver.findElement(showLargeModal).click();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(modalContent)).getText();
        text.contains("Lorem Ipsum");
        driver.findElement(closeLargeModal).click();
    }
}
