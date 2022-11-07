package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title is:"+ driver.getTitle());

        WebElement button= driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
        builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();

        String text= button.getAttribute("data-tooltip");
        System.out.println(text);
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamic-attributes-form")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String sms= driver.findElement(By.id("action-confirmation")).getText();

        System.out.println(sms);
    }
}
