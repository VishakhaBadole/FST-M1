package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(" https://www.training-support.net/selenium/nested-iframes");
        System.out.println("here is title:"+driver.getTitle());
        //Switch to first iFrame on the page

        Thread.sleep(5000);
        driver.switchTo().frame(0);
        //Switch to first iFrame in that frame
        Thread.sleep(5000);
        driver.switchTo().frame(0);

        String Iframe1_Header= driver.findElement(By.className("sub")).getText();
        System.out.println("Header of First frame is:"+Iframe1_Header);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.switchTo().frame(1);


        String Iframe1_Header2= driver.findElement(By.className("sub")).getText();
        System.out.println("Header of Second frame is:"+Iframe1_Header2);

        driver.close();
    }
}
