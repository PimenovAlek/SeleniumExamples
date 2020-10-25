package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AutoComplete {
    WebDriver driver;
    public AutoComplete(WebDriver driver){
        this.driver = driver;
    }
    private By multiple = By.cssSelector("input#autoCompleteMultipleInput");
    private By single = By.cssSelector("input#autoCompleteSingleInput");
    private By colorsRemoveButtons = By.cssSelector("div.css-xb97g8.auto-complete__multi-value__remove");

    public void multiple(String color){
        driver.findElement(multiple).sendKeys(color);
        driver.findElement(multiple).sendKeys(Keys.ENTER);
    }
    public void single(String singleColor){
        driver.findElement(single).click();
        driver.findElement(single).sendKeys(singleColor, Keys.DOWN, Keys.ENTER);
    }
    public void deleteColors(){
        List<WebElement> colors = driver.findElements(colorsRemoveButtons);
        for(WebElement color : colors){
            color.findElement(By.tagName("svg")).click();
        }

    }
}
