package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {
    WebDriver  driver;
    WebDriverWait wait;

    @BeforeMethod
    public void  beforemethod()   {
     driver = new FirefoxDriver();
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/");
    }
    @Test
    public void test(){
    String title = driver.getTitle();
        System.out.println("title is"+title);
        Assert.assertEquals(title,"Training Support");

        driver.findElement(By.id("about-link")).click();
        System.out.println("New title is"+ driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }
    @AfterMethod
    public  void teardown(){
        driver.quit();
    }

}
