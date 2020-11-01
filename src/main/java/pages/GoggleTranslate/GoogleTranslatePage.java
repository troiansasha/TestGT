package pages.GoggleTranslate;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class GoogleTranslatePage extends ParentPage {


    public GoogleTranslatePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//a[text()='Sign in']")
    private WebElement loginButton;
    @FindBy(xpath = ".//input[@name='identifier']")
    private WebElement loginInput;
    @FindBy(id= "identifierNext")
    private WebElement loginNext;
    @FindBy(id="source")
    private WebElement SearchLine;
    @FindBy(xpath=".//div[@id='ft-icon-img-hst']")
    private WebElement ClickOnHistory;
    @FindBy(xpath=".//div[@class='tlid-history-delete-all-button delete-all-button trans-tool-button gt-icon-c']")
    private WebElement ClickOnDeleteHistory;
    @FindBy(xpath=".//*[text()=\"Documents\"]")
    private WebElement ClickOnDocumentsPage;
    @FindBy(xpath=".//div[@class='title'][text()='History']")
    private WebElement historyDisplayed;
    @FindBy(xpath=".//*[text()='Translation history']")
    private WebElement historyDisplayedAfterDelete;
    @FindBy(xpath=".//div[@class='clear-wrap']")
    private WebElement ClickOnCancel;
    @FindBy(xpath=".//div[@class='tlid-input-button input-button header-button tlid-input-button-text text-icon']")
    private WebElement chekGTPage;
    @FindBy(xpath = ".//span[text()='Hello']")
    private WebElement privetDisplayed;
    @FindBy(xpath = ".//div[text()='Russian - detected']")
    private WebElement correctAutoLanguageDisplayed;
    @FindBy(xpath = ".//div[text()='Translations of ']")
    private WebElement tabDisplayed;
    @FindBy(xpath = ".//span[text()=\"Couldn't sign you in\"]")
    private WebElement exeptionDisplayed;
    @FindBy(xpath = ".//*[text()=\"Browse your computer\"]")
    private WebElement browseOnPCDisplayed;


    public void openPageGT() {
        try {
            webDriver.get("https://translate.google.com.ua/");
            logger.info("GT was opened");
        } catch (Exception e) {
            logger.error("Can not open GT Page");
            Assert.fail("Can not open GT Page");
        }
    }

    public boolean headerIsCorrectMainGT() {
        return
                actionsWithOurElements.elementIsDisplayed(chekGTPage);
    }
    public void enterTextInToInputSearch(String SearchPrivet) {
        actionsWithOurElements.enterTextIntoInput(SearchLine, SearchPrivet);
    }
    public void clickOnCancel() {
        actionsWithOurElements.clickOnElement(ClickOnCancel);
    }
    public void clickOnLoginl() {
        actionsWithOurElements.clickOnElement(loginButton);
    }
    public void enterTextInToInputLogin(String LoginEmailInput) {
        actionsWithOurElements.enterTextIntoInput(loginInput, LoginEmailInput);
        actionsWithOurElements.clickOnElement(loginNext);
    }
    public void clickOnHistory() {
        actionsWithOurElements.clickOnElement(ClickOnHistory);
    }
    public void clickOnDeleteHistory() {
        actionsWithOurElements.clickOnElement(ClickOnDeleteHistory);
    }
    public void clickOnDocumentPage() {
        actionsWithOurElements.clickOnElement(ClickOnDocumentsPage);
    }
//    public void clickOnFirstIphone() {
//        actionsWithOurElements.clickOnElement(clickonFirstIphone);
//    }
//
    //Proverki
    public boolean privetIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(privetDisplayed);
    }
    public boolean languageChekIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(correctAutoLanguageDisplayed);
    }
    public boolean tabChekIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(tabDisplayed);
    }
    public boolean cancelChekIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(privetDisplayed);
    }
    public boolean ExeptionIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(exeptionDisplayed);
    }
    public boolean historyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(historyDisplayed);
    }
    public boolean historyIsCorrectAfterDelete(){
        return
                actionsWithOurElements.elementIsDisplayed(historyDisplayedAfterDelete);
    }
    public boolean uploadPageIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(browseOnPCDisplayed);
    }
}
