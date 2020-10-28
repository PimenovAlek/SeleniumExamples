package PageObject.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class Navigation {
    WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public void init(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demoqa.com");
    }
    public void quite(){
        driver.quit();
    }



}
