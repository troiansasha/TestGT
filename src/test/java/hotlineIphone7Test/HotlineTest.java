package hotlineIphone7Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class HotlineTest extends ParentTest {

    final String IPHONE7 = "iPhone 7";

    @Before
    public void enterHotlineValid(){
        //Open block
        test7Page.openPage();
        //Chek valid page
        checkExpectedResult("Page Personel/Drivers is not opened", true, test7Page.headerIsCorrectMainHotline());
    }
    @Test
    public void validSearchAndClick()  {

        test7Page.enterTextInToInputSearch(IPHONE7);
        test7Page.clickSearch();
        test7Page.clickOnFirstIphone();
        checkExpectedResult("Iphone dont find", true, test7Page.iphone7IsCorrect());
    }


}
