package PageObject.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);
    TextBox textBox = new TextBox(driver);
    CheckBox checkBox = new CheckBox(driver);
    Navigation navigation = new Navigation(driver);
    RadioButton radioButton = new RadioButton(driver);



    @BeforeSuite
    public void before(){
        navigation.init();
        mainPage.goToElem();
    }


    @Test
    public void fillAndCheckTextBox(){
        mainPage.goToTextBox();
        textBox.fillTextBoxes();
    }
    @Test
    public void fillAndCheckCheckBox(){
        mainPage.goToCheckBox();
        checkBox.selectCheckBox();
        checkBox.unselectCheckBox();
        checkBox.showTree();
    }
    @Test
    public void radioTest(){
        mainPage.goToRadioButton();
        radioButton.checkHeader();
        radioButton.selectYesRadio();
        radioButton.selectImpressive();
        radioButton.universalWithHelp(Check.YES);
    }


}
