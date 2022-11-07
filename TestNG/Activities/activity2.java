package Activities;

import jdk.jfr.Enabled;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class activity2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void Method1() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void mymethod1(){
        String title= driver.getTitle();
        System.out.println("titile is"+ title);
        Assert.assertEquals(title,"Target Practice");
    }
    @Test
    public void mymethod2(){
        WebElement BlackButton = driver.findElement(By.className("ui black button"));

        Assert.assertEquals(BlackButton.getText(),"Black");
    }

    @Test(enabled =false)
    public void mymethod3() {
        String Color = driver.findElement(By.className("ui black button")).getText();
        Assert.assertTrue(Color.contains("Black"));
    }
    @Test
    public void method4(){
        throw new SkipException("i'am skipped");
    }

       @AfterTest
    public void  quit(){
    driver.close();
    }

}


