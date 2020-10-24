package PageObject.AlertsFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrames {
    WebDriver driver;
    public  NestedFrames(WebDriver driver){
        this.driver = driver;
    }

    private By childFrame = By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']");
    private By parentFrame = By.id("frame1");
    private By childText = By.cssSelector("p");
    private By parentText = By.cssSelector("body");

    public void takeText(){
        String window = driver.getWindowHandle();
        WebElement parent = driver.findElement(parentFrame);

        driver.switchTo().frame(parent);
        driver.findElement(parentText).getText().contains("Parent Iframe");
        WebElement child = driver.findElement(childFrame);
        driver.switchTo().frame(child);
        driver.findElement(childText).getText().contains("Child Iframe");
    }

}
