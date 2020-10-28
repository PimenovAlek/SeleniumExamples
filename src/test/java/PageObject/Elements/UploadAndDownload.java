package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class UploadAndDownload {
    WebDriverWait wait;
    WebDriver driver;
    public UploadAndDownload (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    private By uploadButton = By.id("uploadFile");
    private By uploadedFilePath = By.id("uploadedFilePath");
    private By downloadButton = By.id("downloadButton");
    private By section = By.id("section#button-text-10");

    public void uploadFile(){
        driver.findElement(uploadButton).sendKeys("D:\\Test.txt");
        driver.findElement(uploadedFilePath).getText().equals("C:\\fakepath\\Test.txt");
    }
    public void downloadFile() throws InterruptedException {
        driver.findElement(downloadButton).click();
        driver.findElement(downloadButton).sendKeys("D:\\");
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.CONTROL+ "j").build().perform();
        action.keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(500);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(500);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(500);
    }

}
