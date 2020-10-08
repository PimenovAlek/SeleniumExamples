package PageObject.Elements;

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

    public void tapOnTexBox(){
        driver.findElement(By.cssSelector("div.card.mt-4.top-card:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.element-list.collapse.show li#item-0")).click();
    }

    public void tapOnCheckBox(){
        driver.findElement(By.cssSelector("div.card.mt-4.top-card:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.element-list.collapse.show li#item-1")).click();
    }



}
