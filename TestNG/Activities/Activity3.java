package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver = new FirefoxDriver();

    @BeforeClass
    public void method1() {
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void LoginMethod(){
        WebElement User= driver.findElement(By.id("username"));
        WebElement Pwd= driver.findElement(By.id("password"));

        User.sendKeys("admin");
        Pwd.sendKeys("password");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String Loginmsg= driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println(Loginmsg);
        Assert.assertEquals("Welcome Back, admin",Loginmsg);
    }

    @AfterClass
    public void methodquit() {
        driver.close();

    }

}
