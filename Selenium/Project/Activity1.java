package FST_Selenium_CRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 extends BaseClass {

    @Test
    public void GetTitle() {
        String title = driver.getTitle();

        if (title == "SuiteCRM") {
            System.out.println("Title of page is: " + title);
        }
    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
