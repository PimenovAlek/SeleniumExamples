package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage{
    WebDriver driver;
    private By textBox = By.cssSelector("div.element-list.collapse.show li#item-0");
    private By checkBox = By.cssSelector("div.element-list.collapse.show li#item-1");
    private By radioButton = By.cssSelector("div.element-list.collapse.show li#item-2");
    private By webTables = By.cssSelector("div.element-list.collapse.show li#item-3");
    private By buttons = By.cssSelector("div.element-list.collapse.show li#item-4");
    private By links = By.cssSelector("div.element-list.collapse.show li#item-5");
    private By brokenLinks = By.cssSelector("div.element-list.collapse.show li#item-6");
    private By uploadAndDownload = By.cssSelector("div.element-list.collapse.show li#item-7");
    private By dynamicProperties = By.cssSelector("div.element-list.collapse.show li#item-8");
    private By formItem = By.cssSelector("div.element-list.collapse.show li#item-0");
    private By browserWindows = By.cssSelector("div.element-list.collapse.show li#item-0");
    private By alerts = By.cssSelector("div.element-list.collapse.show li#item-1");
    private By frames = By.cssSelector("div.element-list.collapse.show li#item-2");
    private By nestedFrames = By.cssSelector("div.element-list.collapse.show li#item-3");
    private By modalDialogs = By.cssSelector("div.element-list.collapse.show li#item-4");
    private By accordian = By.cssSelector("div.element-list.collapse.show li#item-0");
    private By autocomplete = By.cssSelector("div.element-list.collapse.show li#item-1");
    private By datePicker = By.cssSelector("div.element-list.collapse.show li#item-2");
    private By slider = By.cssSelector("div.element-list.collapse.show li#item-3");
    private By progressBar = By.cssSelector("div.element-list.collapse.show li#item-4");
    private By tabs = By.cssSelector("div.element-list.collapse.show li#item-5");
    private By toolTips = By.cssSelector("div.element-list.collapse.show li#item-6");
    private By menu = By.cssSelector("div.element-list.collapse.show li#item-1");


    public MainPage(WebDriver driver){
        this.driver = driver;
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
    public void gotoForm(){
        driver.findElement(formItem).click();
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
    public void goToAccordian(){driver.findElement(accordian).click();}
    public void goToAutoComplete(){
        driver.findElement(autocomplete).click();
    }
    public void goToDatePicker(){
        driver.findElement(datePicker).click();
    }
    public void goToSlider(){
        driver.findElement(slider).click();
    }
    public void goToProgressBar(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(progressBar).click();

    }
    public void goToTabs(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(tabs).click();
    }
    public void goToToolTips(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(toolTips).click();
    }
    public void goToMenu(){
        driver.findElement(menu).click();
    }

}
