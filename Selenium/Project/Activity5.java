package FST_Selenium_CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity5 extends Activity4{

    @Test
    public void GetColorOfPage() {
       // LoginPage();
        WebElement GetColor = driver.findElement(By.id("toolbar"));
        String s = GetColor.getCssValue("color");
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
