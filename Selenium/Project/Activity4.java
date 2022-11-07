package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 extends BaseClass {

//    @BeforeClass
//
//    public void OpenUrl()
//    {
//        driver.get("https://alchemy.hguy.co/crm");
//    }
    @Test
    public void LoginPage() {
        // driver.get("https://alchemy.hguy.co/crm");
        WebElement Username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        Username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        WebElement Verify = driver.findElement(By.xpath("//a [@id='tab0']"));
        System.out.println("Hello Login!: " + Verify.getText());
    }


//    @AfterClass
//    public void tearDown() {
//        driver.close();
//    }
}
