package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void OpenUrl() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }


    @DataProvider(name = "Authentication")
    public Object [][] Credentials () {
        return new Object[][] { { "admin", "password" }};
    }
     @Test(dataProvider = "Authentication")
        public void Login(String pUsername, String pPassword) {
        WebElement U  = driver.findElement(By.id("username"));
        WebElement P = driver.findElement(By.id("password"));

        U.sendKeys(pUsername);
        P.sendKeys(pPassword);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String loginMessage= driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
