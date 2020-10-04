package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends ParentPage {

        public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void timer3seconds (){
            webDriver.manage().timeouts().setScriptTimeout(2,TimeUnit.SECONDS);
    }


    public void clearTextBox(){
            webDriver.findElement(By.name("dateInput")).clear();
    }
}
