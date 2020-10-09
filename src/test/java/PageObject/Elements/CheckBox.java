package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBox {
    WebDriver driver;
    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    private By checkBoxUncheck = By.cssSelector("svg.rct-icon.rct-icon-uncheck");
    private By plusBtn = By.cssSelector("svg.rct-icon.rct-icon-expand-all");
    private By minusBtn = By.cssSelector("svg.rct-icon.rct-icon-collapse-all");
    private By checkBoxCheck = By.cssSelector("svg.rct-icon.rct-icon-check");
    private By selected = By.cssSelector("span.text-success");

    public void selectCheckBox(){
        driver.findElement(checkBoxUncheck).click();
    }
    public void unselectCheckBox(){
        driver.findElement(checkBoxCheck).click();
    }
    public void showTree(){
        driver.findElement(plusBtn).click();
    }
    public void checkSelected(){
       List<WebElement> selectedPackages = driver.findElements(selected);
    }

}
