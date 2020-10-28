package PageObject.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Form {
    WebDriver driver;
    WebDriverWait wait;

    public Form(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    //Page fields
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By genderMale = By.cssSelector("input#gender-radio-1");
    private By genderFemale = By.id("gender-radio-2");
    private By genderOther = By.id("gender-radio-3");
    private By userNumber = By.id("userNumber");
    private By dataBirth = By.id("dateOfBirth-wrapper");
    private By subject = By.cssSelector("div.subjects-auto-complete__value-container");
    private By sports = By.id("hobbies-checkbox-1");
    private By reading = By.id("hobbies-checkbox-2");
    private By music = By.id("hobbies-checkbox-3");
    private By uploadPicture =By.id("uploadPicture");
    private By currentAddress = By.id("currentAddress");
    private By state = By.id("state");
    private By city = By.cssSelector(" css-1hwfws3");
    private By submitBtn = By.id("submit");

    //Modal fields
    private By modal = By.cssSelector("div.modal-content");
    private By closeBtn = By.id("closeLargeModal");
    private By modalTableRows = By.cssSelector("tbody tr");
    private By rowName = By.cssSelector(":nth-child(1)");
    private By rowResult = By.cssSelector(":nth-child(2)");

    //Form methods
    public void fillFrom(){

    }

    public void addName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void addLastName(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void addEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void selectMale() {
        WebElement radio = driver.findElement(genderMale);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio);
    }

    public void selectFemale() {
        WebElement radio = driver.findElement(genderFemale);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio);
    }

    public void selectOthers() {
        WebElement radio = driver.findElement(genderOther);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio);
    }

    public void addUserNumber(String number) {
        driver.findElement(userNumber).sendKeys(number);
    }

    public void addBirthDate(){
        /* ToDO */
    }

    public void addSubject(String sub) {
        driver.findElement(subject).sendKeys(sub);
    }

    public void selectSports() {
        WebElement checkBox = driver.findElement(sports);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", checkBox);
    }

    public void selectReading() {
        WebElement checkBox = driver.findElement(reading);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", checkBox);
    }

    public void selectMusic() {
        WebElement checkBox = driver.findElement(music);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", checkBox);
    }

    public void uploadPic(String file) {
        driver.findElement(uploadPicture).sendKeys(file);
    }

    public void addAddress(String text) {
        driver.findElement(currentAddress).sendKeys(text);
    }

    public void addState(String stateName) {
        driver.findElement(state).sendKeys(stateName);
    }

    public void addCity(String cityName) {
        driver.findElement(city).sendKeys(cityName);
    }

    public void subButton() {
        driver.findElement(submitBtn).click();
    }

    //Modal methods
    public boolean isVisible() {
        if (driver.findElement(modal).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void closeModal() {
        if (isVisible()) {
            driver.findElement(closeBtn).click();
        }
    }

    public Map<String, String> getResults(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modal));
        Map<String, String> results = new HashMap<String, String>();
        List<WebElement> rows = driver.findElements(modalTableRows);
        for (WebElement row: rows){
            results.put(row.findElement(rowName).getText(), row.findElement(rowResult).getText());
            System.out.println(results.get(row.findElement(rowName).getText()));
        }
        return results;
    }
    public void scrollPage(int value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+value+")");
    }

    public void checkModalResults(String actual, String expected){
        getResults().get(actual).equals(expected);
    }




}
