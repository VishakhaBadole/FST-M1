package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
  public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Page Title is>> "+driver.getTitle());
       WebElement Contxtbutton =  driver.findElement(By.cssSelector("button.violet"));
       Contxtbutton.click();

       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        String HelloText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Wait for the text to say >>" +HelloText);

        //Wait for late text
         wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
        String LateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Wait for the text to say >>" +LateText);


    }

}
