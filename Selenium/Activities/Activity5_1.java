package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title is:"+ driver.getTitle());

       WebElement Checkbox = driver.findElement(By.cssSelector("input.willDisappear"));
        System.out.println( "Check Box displayed? "+ Checkbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("result of the isDisplayed():"+Checkbox.isDisplayed());

        driver.close();
    }
}
