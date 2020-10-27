package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTips {
    WebDriver driver;
    WebDriverWait wait;
    public ToolTips(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By toolTipButton = By.id("toolTipButton");
    private By toolTipInner = By.cssSelector("div.tooltip-inner");
    private By toolTipInner2 = By.cssSelector("div.tooltip-inner");
    private By toolTipInner3 = By.cssSelector("div.tooltip-inner");
    private By toolTipInner4 = By.cssSelector("div.tooltip-inner");
    private By toolTipTextField = By.id("toolTipTextField");
    private By firstLink = By.cssSelector("div#texToolTopContainer a:nth-child(1)");
    private By secondLink = By.cssSelector("div#texToolTopContainer a:nth-child(2)");
    private By fff = By.cssSelector("div#buttonToolTopContainer p");

    public String hoverOnButton() throws InterruptedException {
        WebElement button = driver.findElement(toolTipButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(button).build().perform();
        Thread.sleep(1000);
        String text =  wait.until(ExpectedConditions.visibilityOfElementLocated(toolTipInner)).getText();
        return text;
    }

    public String hoverOnTextField() throws InterruptedException {
        WebElement field = driver.findElement(toolTipTextField);
        Actions actions = new Actions(driver);
        actions.moveToElement(field).build().perform();
        Thread.sleep(1000);
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(toolTipInner2)).getText();
        return text;
    }

    public String hoverOnFirstLink() throws InterruptedException {
        WebElement first = driver.findElement(firstLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(first).build().perform();
        Thread.sleep(1000);
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(toolTipInner3)).getText();
        return text;
    }

    public String hoverOnSecondLink() throws InterruptedException {
        WebElement second = driver.findElement(secondLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(second).build().perform();
        Thread.sleep(1000);
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(toolTipInner4)).getText();
        return text;
    }

}
