package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title is:"+ driver.getTitle());
        WebElement Username= driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
        WebElement Password = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
        Username.sendKeys("admin");
        Password.sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        String Loginmsg= driver.findElement(By.xpath("//div[contains(@class,'green')]")).getText();

        System.out.println(Loginmsg);

        driver.close();
    }
}
