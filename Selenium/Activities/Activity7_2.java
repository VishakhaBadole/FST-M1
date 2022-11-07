package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("title is :" + driver.getTitle());
        WebElement Uname = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement pwd = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement ConfPWD = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input"));
        WebElement mailid = driver.findElement(By.xpath("//label[text()='Email']/following::input"));
        Uname.sendKeys("asd");
        pwd.sendKeys("asd");
        ConfPWD.sendKeys("asd");
        mailid.sendKeys("asd@sample.com");

        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

        String msg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(msg);
    }
}
