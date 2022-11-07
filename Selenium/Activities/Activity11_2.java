package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("confirm")).click();
        Alert ConfAlert= driver.switchTo().alert();
        System.out.println(ConfAlert.getText());
        ConfAlert.dismiss();
    }
}
