package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity7 extends Activity4{
    @Test
    public void GetInfoOf_SalesMenu(){
        driver.findElement(By.id("grouptab_0")).click();

     driver.findElement(By.id("moduleTab_9_Leads")).click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@title,'Additional Details')]")));
        driver.findElement(By.xpath("//span[contains(@title,'Additional Details')]")).click();
     String PhoneNumber=  driver.findElement(By.className("phone")).getText();
        System.out.println("Phone Number is"+PhoneNumber);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
