package PageObject.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox{
    WebDriver driver;
    public TextBox(WebDriver driver){
        this.driver = driver;
    }

    private By userName = By.cssSelector("input#userName");
    private By userEmail = By.cssSelector("input#userEmail");
    private By currentAddress = By.cssSelector("textarea#currentAddress");
    private By permanentAddress = By.cssSelector("textarea#permanentAddress");
    private By submit = By.cssSelector("button#submit");
    private By name = By.cssSelector("p#name");


    public void fillTextBoxes(String user, String email, String curAddress, String perAddress){
        setUserName(user);
        setEmail(email);
        setCurrentAddress(curAddress);
        setPermanentAddress(perAddress);
        clickSubmit();
        getResult(user);
    }

    public void setUserName(String user){
        driver.findElement(userName).sendKeys(user);
    }

    public void setEmail(String email){
        driver.findElement(userEmail).sendKeys(email);
    }

    public void setCurrentAddress(String curAddress){
        driver.findElement(currentAddress).sendKeys(curAddress);
    }

    public void setPermanentAddress(String perAddress){
        driver.findElement(permanentAddress).sendKeys(perAddress);
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }

    public void getResult(String result){
        driver.findElement(name).getText().contains(result);
    }




}
