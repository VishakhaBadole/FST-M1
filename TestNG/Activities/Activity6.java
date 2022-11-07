package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Activity6 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void OpenUrl() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"pUsername","pPassword"})
    public void Login(String pUsername, String pPassword) {
        WebElement Username= driver.findElement(By.id("username"));
        WebElement Password= driver.findElement(By.id("password"));
        Username.sendKeys(pUsername);
        Password.sendKeys(pPassword);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String loginMessage= driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
