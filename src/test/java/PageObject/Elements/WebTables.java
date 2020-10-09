package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WebTables {
    WebDriver driver;

    public WebTables(WebDriver driver){
        this.driver = driver;
    }
    private By addNewRecord = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submit = By.id("submit");
    private By tableRows = By.cssSelector("div.rt-tr");
    private By rowsAmount = By.tagName("select");

    public void openForm(){
        driver.findElement(addNewRecord).click();
    }

    public void setFirstName(String name){
        driver.findElement(firstName).sendKeys(name);
    }

    public void setLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void setEmail(String email){
        driver.findElement(userEmail).sendKeys(email);
    }

    public void setAge(String userAge){
        driver.findElement(age).sendKeys(userAge);
    }

    public void setSalary(String value){
        driver.findElement(salary).sendKeys(value);
    }

    public void setDepartment(String depName){
        driver.findElement(department).sendKeys(depName);
    }

    public void submitForm(){
        driver.findElement(submit).click();
    }

    public void add(String name, String lastName, String email, String age, String value, String department){
        openForm();
        setFirstName(name);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setSalary(value);
        setDepartment(department);
        submitForm();
    }
    public List<WebElement> getRows(){
        List<WebElement> rows = driver.findElements(tableRows);
        return rows;
    }
    public void isRecordCreated(){
        List<WebElement> names  = new ArrayList<WebElement>();
        for(WebElement row : getRows()){

        }
    }

    public void selectAmountOfRows(int amount){
        Select rows = new Select(driver.findElement(rowsAmount));
        rows.selectByValue(String.valueOf(amount));
        Assert.assertEquals(amount,getRows().size() - 1);
    }






}
