package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.GoggleTranslate.GoogleTranslatePage;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    protected WebDriver webDriver;
    protected HomePage homePage;
    protected pages.GoggleTranslate.GoogleTranslatePage GoogleTranslatePage;


    //Precondition
    @Before
    public void setUp() {
        File file = new File("./src/Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        GoogleTranslatePage = new GoogleTranslatePage(webDriver);
        homePage = new HomePage(webDriver);


    }
////    Exit Browser
//    @After
//    public void tearDown () {
//        webDriver.quit();
//    }



    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult){

        Assert.assertEquals(message, expectedResult, actualResult);

    }

//    public void checkExpectedResult (String message, boolean actualResult){
//        checkExpectedResult(message, actualResult);
//    }
}
