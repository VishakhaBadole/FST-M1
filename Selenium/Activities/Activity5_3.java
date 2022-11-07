package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        WebElement inputText= driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Check input text is enabled?"+inputText.isEnabled());
        WebElement toggle = driver.findElement(By.id("toggleInput"));
        toggle.click();
        System.out.println("Check input text is enabled?"+inputText.isEnabled());
    }
}
