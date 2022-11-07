package FST_Selenium_CRM_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class CloseClass extends BaseClass {

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
