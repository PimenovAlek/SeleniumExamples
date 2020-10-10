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
    WebTables webTables = new WebTables(driver);
    Buttons buttons = new Buttons(driver);

    @BeforeSuite
    public void before(){
        navigation.init();
        mainPage.goToElem();
    }

    @Test
    public void TextBoxTest(){
        mainPage.goToTextBox();
        textBox.fillTextBoxes("Alex","test@test.test", "st Test apartments 113", "st TestTestTest 45");
    }
    @Test
    public void selectAndCheckCheckBox(){
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
    @Test
    public void webTable(){
        mainPage.goToWebTables();
        webTables.add("Alex","Test", "test@test.tt", "23","14000","Test department");
        webTables.openCreatedRecordForEdit("Alex");
        webTables.deleteRecord("Alex");
        webTables.search("Cierra");
    }

    @Test
    public void buttonsTest(){
        mainPage.goToButtons();
        buttons.doubleClick();
        buttons.rightClick();
        buttons.clickMe();
    }

}
