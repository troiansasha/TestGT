package GoogleTranslateTest;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class GTTest extends ParentTest {

    final String INPUTTOTRANSLATE = "Привет";
    final String INPUTTOTRANSLATE2 = "Мир";
    final String INPUTTOLOGIN = "troianwork@gmail.com";

    @Before
    public void enterGoogleTranslateValid(){
        //Open block
        GoogleTranslatePage.openPageGT();
        //Chek valid page
        checkExpectedResult("Page Google Translate not opened", true, GoogleTranslatePage.headerIsCorrectMainGT());
    }
    @Test
    public void validSearch()  {

        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE);
        checkExpectedResult("Привет dont find", true, GoogleTranslatePage.privetIsCorrect());
    }
    @Test
    public void validLanguageChek()  {

        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE);
        checkExpectedResult("AutoLanguage dont find", true, GoogleTranslatePage.languageChekIsCorrect());
    }
    @Test
    public void validTabWithTranslationChek()  {

        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE);
        homePage.timer2seconds();
        checkExpectedResult("Tab dont find", true, GoogleTranslatePage.tabChekIsCorrect());
    }
    @Test
    public void validCancelTranslationChek()  {

        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE);
        GoogleTranslatePage.clickOnCancel();
        checkExpectedResult("Delete dont find", false, GoogleTranslatePage.cancelChekIsCorrect());
    }
    @Test
    public void semyValidLoginChek()  {

        GoogleTranslatePage.clickOnLoginl();
        GoogleTranslatePage.enterTextInToInputLogin(INPUTTOLOGIN);
        checkExpectedResult("Invalid dont find", true, GoogleTranslatePage.ExeptionIsCorrect());
    }
    @Test
    public void semyValidHistoryChek()  {

        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE);
        checkExpectedResult("Привет dont find", true, GoogleTranslatePage.privetIsCorrect());
        GoogleTranslatePage.enterTextInToInputSearch(INPUTTOTRANSLATE2);
        GoogleTranslatePage.clickOnHistory();
        checkExpectedResult("History dont find", true, GoogleTranslatePage.historyIsCorrect());
        GoogleTranslatePage.clickOnDeleteHistory();
        checkExpectedResult("History 2 dont find", true, GoogleTranslatePage.historyIsCorrectAfterDelete());


    }
    @Test
    public void validUploadOfDocument()  {

        GoogleTranslatePage.clickOnDocumentPage();
        checkExpectedResult("Document page dont find", true, GoogleTranslatePage.uploadPageIsCorrect());
    }

}
