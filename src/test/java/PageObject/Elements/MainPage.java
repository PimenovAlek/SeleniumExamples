package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage{
    WebDriver driver;

    By element = By.cssSelector("div.card.mt-4.top-card:nth-child(1)");
    By form = By.cssSelector("div.card.mt-4.top-card:nth-child(2)");
    By alertsFrameAndWindows = By.cssSelector("div.card.mt-4.top-card:nth-child(2)");
    By textBox = By.cssSelector("div.element-list.collapse.show li#item-0");
    By checkBox = By.cssSelector("div.element-list.collapse.show li#item-1");
    By radioButton = By.cssSelector("div.element-list.collapse.show li#item-2");
    By webTables = By.cssSelector("div.element-list.collapse.show li#item-3");
    By buttons = By.cssSelector("div.element-list.collapse.show li#item-4");
    By links = By.cssSelector("div.element-list.collapse.show li#item-5");
    By brokenLinks = By.cssSelector("div.element-list.collapse.show li#item-6");
    By uploadAndDownload = By.cssSelector("div.element-list.collapse.show li#item-7");
    By dynamicProperties = By.cssSelector("div.element-list.collapse.show li#item-8");
    By formItem = By.cssSelector("div.element-list.collapse.show li#item-0");
    By browserWindows = By.cssSelector("div.element-list.collapse.show li#item-0");
    By alerts = By.cssSelector("div.element-list.collapse.show li#item-1");
    By frames = By.cssSelector("div.element-list.collapse.show li#item-2");
    By nestedFrames = By.cssSelector("div.element-list.collapse.show li#item-3");
    By modalDialogs = By.cssSelector("div.element-list.collapse.show li#item-4");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage goToElem(){
        driver.findElement(element).click();
        return this;
    }
    public MainPage goToTextBox(){
        driver.findElement(textBox).click();
        return this;
    }
    public MainPage goToCheckBox(){
        driver.findElement(checkBox).click();
        return this;
    }
    public MainPage goToRadioButton(){
        driver.findElement(radioButton).click();
        return this;
    }
    public MainPage goToWebTables(){
        driver.findElement(webTables).click();
        return this;
    }
    public MainPage goToButtons(){
        driver.findElement(buttons).click();
        return this;
    }
    public MainPage goToLinks(){
        driver.findElement(links).click();
        return this;
    }

    public MainPage goToBrokenLinks(){
        driver.findElement(brokenLinks).click();
        return this;
    }
    public MainPage goToUploadAndDownload(){
        driver.findElement(uploadAndDownload).click();
        return this;
    }
    public MainPage goToDynamicProperties(){
        driver.findElement(dynamicProperties).click();
        return this;
    }
    public void goToForms() {
        driver.findElement(form).click();
        driver.findElement(formItem).click();
    }
    public void goToAlertsFramesAndWindows(){
        driver.findElement(alertsFrameAndWindows).click();
    }
    public void goToBrowserWindows(){
        driver.findElement(browserWindows).click();
    }
    public void goToAlerts(){
        driver.findElement(alerts).click();
    }
    public void goToFrames(){
        driver.findElement(frames).click();
    }
    public void goToNestedFrames(){
        driver.findElement(nestedFrames).click();
    }
    public void goToModalDialogs(){
        driver.findElement(modalDialogs).click();
    }

}
