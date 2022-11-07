package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass {
@Test
 //Get the url of the header image.
    public void GetHeaderImageUrlOfCompanyLogo(){
   WebElement PrintLogourl=  driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
    System.out.println("Here is  the URL Header Image Of CompanyLogo: "+PrintLogourl.getAttribute("src"));
}
    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
