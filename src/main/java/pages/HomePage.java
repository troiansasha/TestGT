package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends ParentPage {

        public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void timer2seconds(){
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        logger.info("2 second timer for download started");
    }


    public void clearTextBox(){
            webDriver.findElement(By.name("dateInput")).clear();
    }
}
