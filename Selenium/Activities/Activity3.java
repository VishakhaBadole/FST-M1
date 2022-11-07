package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String urlname = driver.getTitle();
        System.out.println("URL Title is :"+ urlname);
        WebElement FirstName = driver.findElement(By.id("firstName"));

        Thread.sleep(5000);
        WebElement LastName = driver.findElement(By.id("lastName"));
        WebElement PhoneNum = driver.findElement(By.id("number"));
        WebElement Email = driver.findElement(By.id("email"));

        FirstName.sendKeys("Vishakha");
        LastName.sendKeys("Ji");
        PhoneNum.sendKeys("1234567890");
        Email.sendKeys("vishakha@sample.com");

        //submit
        driver.findElement(By.cssSelector("input.green")).click();
                driver.quit();
    }
}
