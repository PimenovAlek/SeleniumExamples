package PageObject;

import PageObject.AlertsFramesAndWindows.*;
import PageObject.AppManager.Navigation;
import PageObject.Elements.*;
import PageObject.Forms.Form;
import PageObject.Widgets.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static PageObject.Widgets.TabsCheckData.*;

public class Tests {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait =new WebDriverWait(driver, 10);
    MainPage mainPage = new MainPage(driver);
    TextBox textBox = new TextBox(driver);
    CheckBox checkBox = new CheckBox(driver);
    Navigation navigation = new Navigation(driver);
    RadioButton radioButton = new RadioButton(driver);
    WebTables webTables = new WebTables(driver);
    Buttons buttons = new Buttons(driver);
    Links links = new Links(driver, wait);
    Form form = new Form(driver, wait);
    UploadAndDownload uploadAndDownload = new UploadAndDownload(driver,wait);
    Alerts alerts = new Alerts(driver, wait);
    BrowserWindows browserWindows = new BrowserWindows(driver, wait);
    Frames frames = new Frames(driver);
    NestedFrames nestedFrames = new NestedFrames(driver);
    ModalDialogs modalDialogs = new ModalDialogs(driver, wait);
    Accordian accordian = new Accordian(driver, wait);
    AutoComplete autoComplete = new AutoComplete(driver);
    DatePicker datePicker = new DatePicker(driver);
    ProgressBar progressBar = new ProgressBar(driver, wait);
    ToolTips toolTips = new ToolTips(driver, wait);
    HomePage homePage = new HomePage(driver, wait);
    Tabs tabs = new Tabs(driver);

    @BeforeSuite
    public void before(){
        navigation.init();
    }

    @Test
    public void TextBoxTest(){
        homePage.goToWidgets();
        homePage.goToElem();
        mainPage.goToTextBox();
        textBox.fillTextBoxes("Alex","test@test.te", "st Test apartments 113", "st TestTestTest 45");
    }
    @Test
    public void selectAndCheckCheckBox(){
        homePage.goToElem();
        mainPage.goToCheckBox();
        checkBox.selectCheckBox();
        checkBox.unselectCheckBox();
        checkBox.showTree();
    }
    @Test
    public void radioTest(){
        homePage.goToElem();
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
        homePage.goToElem();
        mainPage.goToButtons();
        buttons.doubleClick();
        buttons.rightClick();
        buttons.clickMe();
    }

    @Test
    public void links(){
        homePage.goToElem();
        mainPage.goToLinks();
        links.clickOnSimple();
        links.clickOnDynamic();
    }

    @Test
    public void uploadDownload() throws InterruptedException {
        homePage.goToElem();
        mainPage.goToUploadAndDownload();
        uploadAndDownload.uploadFile();
//        uploadAndDownload.downloadFile();

    }
    @Test
    public void fillForm(){
        homePage.goToForms();
        mainPage.gotoForm();
        form.addName("Aaaaaaaaaa");
        form.addLastName("Bbbbbbbbbbbb");
        form.selectMale();
        form.addUserNumber("9876543210");
        form.selectReading();
        form.scrollPage(300);
        form.subButton();
        form.checkModalResults("Mobile", "9876543210");
        form.closeModal();
        form.scrollPage(-300);
    }
    @Test
    public void browserWindowsPageTest(){
        homePage.goToAlertsFramesAndWindows();
        mainPage.goToBrowserWindows();
        browserWindows.openMessageWindowButton();
    }
    @Test
    public void alerts(){
        homePage.goToAlertsFramesAndWindows();
        mainPage.goToAlerts();
        alerts.openAndClose();
        alerts.openAlertWithTimer();
        alerts.acceptPrompt();
        alerts.cancelPrompt();
        alerts.enterTextIn("Alalalalalala");
    }
    @Test
    public void frameTest(){
        homePage.goToAlertsFramesAndWindows();
        mainPage.goToFrames();
        frames.getTextFromSecondFrame();
        frames.getTextFromFrame();
    }
    @Test
    public void nestedFramesTest(){
        homePage.goToAlertsFramesAndWindows();
        mainPage.goToNestedFrames();
        nestedFrames.takeText();
    }
    @Test
    public void modalDialogs(){
        homePage.goToAlertsFramesAndWindows();
        mainPage.goToModalDialogs();
        modalDialogs.openSmallModal();
        modalDialogs.openLargeModal();
    }
    @Test
    public void accordianTest(){
        homePage.goToWidgets();
        mainPage.goToAccordian();
        Assert.assertTrue(accordian.selectFirst().contains("has survived not"));
        System.out.println(accordian.selectSecond());
        Assert.assertTrue(accordian.selectSecond().contains("classical literature"));
        Assert.assertTrue(accordian.selectThird().contains("English"));
    }
    @Test
    public void autoCompleteTest(){
        homePage.goToWidgets();
        mainPage.goToAutoComplete();
        autoComplete.multiple("Red");
        autoComplete.multiple("Yell");
        autoComplete.multiple("Black");
        autoComplete.deleteColors();
    }

    @Test
    public void datePickTest(){
        homePage.goToWidgets();
        mainPage.goToDatePicker();
        datePicker.pickTheDate(6, "1998", 0, 5);
    }
    @Test
    public void progressBar(){
        homePage.goToWidgets();
        mainPage.goToProgressBar();
        progressBar.clickButton();
        assert progressBar.checkButtonName().equals("Stop");
        progressBar.stopProgressBar(44);
        assert progressBar.checkButtonName().equals("Start");
    }

    @Test
    public void hoverTest() throws InterruptedException {
        homePage.goToWidgets();
        mainPage.goToToolTips();
        Assert.assertEquals(toolTips.hoverOnButton(), "You hovered over the Button");

        Assert.assertEquals(toolTips.hoverOnTextField(), "You hovered over the text field");

        Assert.assertEquals(toolTips.hoverOnFirstLink(), "You hovered over the Contrary");

        Assert.assertEquals(toolTips.hoverOnSecondLink(), "You hovered over the 1.10.32");
    }

    @Test
    public void tabsTest(){
        homePage.goToWidgets();
        mainPage.goToTabs();
        Assert.assertEquals(tabs.selectWhatTabAndGetText(), whatContent);
        Assert.assertEquals(tabs.selectUseTabAndGetText(), useContent);
        Assert.assertTrue(tabs.selectMoreTabAndGetText());

    }

    @AfterSuite
    public void quite(){ navigation.quite();
    }

}
