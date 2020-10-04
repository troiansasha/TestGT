package pages.TestIphone7;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;
import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class Test7Page extends ParentPage {


    public Test7Page(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="doSearch")
    private WebElement buttonSubmit;
    @FindBy(id="searchbox")
    private WebElement SearchLine;
    @FindBy(xpath=".//*[text()='HOTLINE.FINANCE']")
    private WebElement chekHotlinePage;
    @FindBy(xpath = ".//*[@href=\"/mobile-mobilnye-telefony-i-smartfony/apple-iphone-7-32gb-black/\"]")
    private WebElement clickonFirstIphone;
    @FindBy(xpath = ".//*[text()='iPhone 7 32GB Black (MN8X2)']")
    private WebElement iphone7Displayed;


    public void openPage() {
        try {
            webDriver.get("https://hotline.ua/");
            logger.info("Hotline was opened");
        } catch (Exception e) {
            logger.error("Can not open Hotline Page");
            Assert.fail("Can not open Hotline Page");
        }
    }

    public boolean headerIsCorrectMainHotline() {
        return
                actionsWithOurElements.elementIsDisplayed(chekHotlinePage);
    }
    public void enterTextInToInputSearch(String SearchLineIphone7) {
        actionsWithOurElements.enterTextIntoInput(SearchLine, SearchLineIphone7);
    }
    public void clickSearch() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }
    public void clickOnFirstIphone() {
        actionsWithOurElements.clickOnElement(clickonFirstIphone);
    }

    public boolean iphone7IsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(iphone7Displayed);
    }
}
