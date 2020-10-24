package PageObject;

import PageObject.AlertsFramesAndWindows.*;
import PageObject.Elements.*;
import PageObject.Forms.Form;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait =new WebDriverWait(driver, 5);
    MainPage mainPage = new MainPage(driver);
    TextBox textBox = new TextBox(driver);
    CheckBox checkBox = new CheckBox(driver);
    Navigation navigation = new Navigation(driver);
    RadioButton radioButton = new RadioButton(driver);
    WebTables webTables = new WebTables(driver);
    Buttons buttons = new Buttons(driver);
    Links links = new Links(driver, wait);
    Form form = new Form(driver, wait);
    UploadAndDownload uploadAndDownload = new UploadAndDownload(driver);
    Alerts alerts = new Alerts(driver, wait);
    BrowserWindows browserWindows = new BrowserWindows(driver, wait);
    Frames frames = new Frames(driver);
    NestedFrames nestedFrames = new NestedFrames(driver);
    ModalDialogs modalDialogs = new ModalDialogs(driver, wait);

    @BeforeSuite
    public void before(){
        navigation.init();

    }

    @Test
    public void TextBoxTest(){
        mainPage.goToElem();
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

    @Test
    public void links(){
        mainPage.goToLinks();
        links.clickOnSimple();
        links.clickOnDynamic();
    }

    @Test
    public void uploadDownload(){
        mainPage.goToUploadAndDownload();
        uploadAndDownload.uploadFile();
        uploadAndDownload.downloadFile();

    }
    @Test
    public void fillForm(){
        mainPage.goToForms();
        form.addName("Aaaaaaaaaa");
        form.addLastName("Bbbbbbbbbbbb");
        form.selectMale();
        form.addUserNumber("9876543210");
        form.selectReading();
        form.subButton();
        form.checkModalResults("Mobile", "9876543210");
    }
    @Test
    public void browserWindowsPageTest(){
        mainPage.goToAlertsFramesAndWindows();
        mainPage.goToBrowserWindows();
        browserWindows.openMessageWindowButton();
    }
    @Test
    public void alerts(){
        mainPage.goToAlertsFramesAndWindows();
        mainPage.goToAlerts();
        alerts.openAndClose();
        alerts.openAlertWithTimer();
        alerts.acceptPrompt();
        alerts.cancelPrompt();
        alerts.enterTextIn("Alalalalalala");
    }
    @Test
    public void frameTest(){
        mainPage.goToAlertsFramesAndWindows();
        mainPage.goToFrames();
        frames.getTextFromSecondFrame();
        frames.getTextFromFrame();
    }
    @Test
    public void nestedFramesTest(){
        mainPage.goToAlertsFramesAndWindows();
        mainPage.goToNestedFrames();
        nestedFrames.takeText();
    }
    @Test
    public void modalDialogs(){
        mainPage.goToAlertsFramesAndWindows();
        mainPage.goToModalDialogs();
        modalDialogs.openSmallModal();
        modalDialogs.openLargeModal();
    }

    @AfterSuite
    public void quite(){
//        navigation.quite();
    }

}
