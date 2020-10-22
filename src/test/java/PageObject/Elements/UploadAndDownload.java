package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadAndDownload {
    WebDriver driver;
    public UploadAndDownload (WebDriver driver){
        this.driver = driver;
    }
    private By uploadButton = By.id("uploadFile");
    private By uploadedFilePath = By.id("uploadedFilePath");
    private By downloadButton = By.id("downloadButton");

    public void uploadFile(){
        driver.findElement(uploadButton).sendKeys("D:\\Test.txt");
        driver.findElement(uploadedFilePath).getText().equals("C:\\fakepath\\Test.txt");
    }
    public void downloadFile(){
        driver.findElement(downloadButton).click();
        driver.findElement(downloadButton).sendKeys("D:\\");
    }

}
