package PageObject.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DatePicker {
    WebDriver driver;
    public DatePicker(WebDriver driver){
        this.driver = driver;
    }

    private By datePickerMonthYearInput = By.id("datePickerMonthYearInput");
    private By pickerModal = By.cssSelector("div.react-datepicker");
    private By months = By.cssSelector("select.react-datepicker__month-select");
    private By years = By.cssSelector("select.react-datepicker__year-select");
    private By weeks = By.cssSelector("div.react-datepicker__week");
    private By days = By.cssSelector("div.react-datepicker__day");


    private By monthSelect = By.cssSelector("div.react-datepicker__month-read-view");
    private By yearSelect = By.cssSelector("div.react-datepicker__year-read-view");
    private By dtMonths = By.cssSelector("div.react-datepicker__month-option");
    private By dateAndTimePickerInput = By.id("dateAndTimePickerInput");

    public void pickTheDate(int m, String y,int w, int d){
        driver.findElement(datePickerMonthYearInput).click();
        if(driver.findElement(pickerModal).isDisplayed()){
            WebElement monthsSelect = driver.findElement(months);
            Select selectM = new Select(monthsSelect);
            selectM.selectByValue(m + "");
            WebElement yearSelect = driver.findElement(years);
            Select selectY = new Select(yearSelect);
            selectY.selectByValue(y);
            getDay(w, d).click();
        }
    }

    public void pickTheDateAndTime(int m, int y, int d, int t){
        driver.findElement(dateAndTimePickerInput).click();
        if(driver.findElement(pickerModal).isDisplayed()){

            driver.findElement(monthSelect).click();
            List<WebElement> months = driver.findElements(dtMonths);
            months.get(m).click();

            driver.findElement(yearSelect).click();

            List<WebElement> years;



        }
    }

    public WebElement getWeek(int number){
        if(driver.findElement(pickerModal).isDisplayed()){
            List<WebElement> w = driver.findElements(weeks);
            return w.get(number);
        }
        return null;
    }
    public WebElement getDay(int week, int day){
        if(driver.findElement(pickerModal).isDisplayed()){
            List<WebElement> d = getWeek(week).findElements(days);
            return d.get(day);
        }
        return null;
    }
    //TODO method for getting day by his number in chosen month
    public void getDayFromMonth(){

    }


}
