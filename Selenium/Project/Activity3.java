package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass {

    @Test
    //Get the first copyright text in the footer.
    public void GetFooterText() {
     //   driver.get("https://alchemy.hguy.co/crm/");
       WebElement Footertext =driver.findElement(By.xpath("//a[@id='admin_options']"));
        System.out.println("text is: " + Footertext.getText());

    }

   @AfterClass
   public void tearDown() {
       driver.close();
   }
}
