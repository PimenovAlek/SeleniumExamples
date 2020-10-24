package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Frames {
    WebDriver driver;

    public Frames(WebDriver driver){
        this.driver = driver;
    }
    private By frame1 = By.id("frame1");
    private By frame2 = By.id("frame2");
    private By sampleHeading = By.id("sampleHeading");

    public void getTextFromFrame(){
        String window = driver.getWindowHandle();
        WebElement frame = driver.findElement(frame1);
        driver.switchTo().frame(frame);
        String text = driver.findElement(sampleHeading).getText();
        Assert.assertEquals(text, "This is a sample page");
        driver.switchTo().window(window);

    }
    public void getTextFromSecondFrame(){
        String window = driver.getWindowHandle();
        WebElement iframe = driver.findElement(frame2);
        driver.switchTo().frame(iframe);
        String text = driver.findElement(sampleHeading).getText();
        Assert.assertEquals(text, "This is a sample page");
        driver.switchTo().window(window);
    }

}
