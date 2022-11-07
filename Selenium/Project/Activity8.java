package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.List;

public class Activity8 extends Activity4{
    @Test
    public void TraversingAccountPage(){
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Accounts")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oddListRowS1")));

        List<WebElement>  rows = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

      WebElement cell= driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
        System.out.println("print  first cell " + cell.getText());

        for(int i=1; i<=10; i++) {
            if(i % 2 !=0 ){
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]"));
                WebElement row2 = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[4]"));
                System.out.println("odd-numbered rows  " + i + ": " + row.getText()+"  City is :"+row2.getText());

            }
        }

        }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
    }

