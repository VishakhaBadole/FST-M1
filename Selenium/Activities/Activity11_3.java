package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("prompt")).click();
        Alert PromptAlert = driver.switchTo().alert();
        System.out.println(PromptAlert.getText());
        PromptAlert.sendKeys("Yes, you are!");
        PromptAlert.accept();
        driver.close();

    }
}
