package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity6 extends Activity4 {
    @Test
    public void CheckMenuItem() {
        boolean ActivityButton = driver.findElement(By.className("dropdown-toggle")).isDisplayed();
        System.out.println("Activities Menu item is displayed: " + ActivityButton);

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
