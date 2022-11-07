package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class Activity9 extends Activity4{
    @Test
    public void TraversingAccountPage(){
        driver.findElement(By.id("grouptab_0")).click();

        driver.findElement(By.id("moduleTab_9_Leads")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@title,'Additional Details')]")));
//print size
  //      List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

        for(int i=1; i<=10; i++) {
                      WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]"));
                WebElement row2 = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[8]"));
                System.out.println("numbered rows  " + i + ": " + row.getText()+"  User Nmae  is :"+row2.getText());


        }

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
