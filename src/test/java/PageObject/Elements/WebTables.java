package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
    private By editButton = By.cssSelector("span.mr-2 svg");
    private By deleteButton = By.cssSelector("span[title='Delete'] svg");
    private By columnName = By.cssSelector("div.rt-td:nth-child(1)");
    private By columnLastName = By.cssSelector("div.rt-td:nth-child(2)");
    private By columnAge = By.cssSelector("div.rt-td:nth-child(3)");
    private By columnEmail = By.cssSelector("div.rt-td:nth-child(4)");
    private By columnSalary = By.cssSelector("div.rt-td:nth-child(5)");
    private By columnDepartment = By.cssSelector("div.rt-td:nth-child(6)");
    private By columnAction = By.cssSelector("div.rt-td:nth-child(7)");
    private By searchField = By.id("searchBox");

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

    public List<WebElement> getTableRows(){
        List<WebElement> rows = driver.findElements(tableRows);
        return rows;
    }

    public void openCreatedRecordForEdit(String name){
        List<WebElement> rows = getTableRows();
        for(int i = 1; i<rows.size();i++){
            if(rows.get(i).findElement(columnName).getText().equals(name)){
                rows.get(i).findElement(editButton).click();
            }
        }
        Assert.assertEquals(driver.findElement(firstName).getAttribute("value"), name);
        Assert.assertEquals(driver.findElement(userEmail).getAttribute("value"), "test@test.tt");
        submitForm();

    }

    public void deleteRecord(String name){
        List<WebElement> rows = getTableRows();
        for(int i = 1; i<rows.size();i++){
            if(rows.get(i).findElement(columnName).getText().equals(name)){
                rows.get(i).findElement(deleteButton).click();
            }
        }

    }

    public void selectAmountOfRows(int amount){
        Select rows = new Select(driver.findElement(rowsAmount));
        rows.selectByValue(String.valueOf(amount));
        Assert.assertEquals(amount,getTableRows().size() - 1);
    }

    public void search(String search){
        driver.findElement(searchField).sendKeys(search);
    }

}
