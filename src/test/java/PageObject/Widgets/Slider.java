package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {
    WebDriver driver;
    WebDriverWait wait;
    public Slider(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

}
