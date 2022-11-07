package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title is"+driver.getTitle());
        WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected? "+CheckBox.isSelected());
        CheckBox.click();
        //Print status
        System.out.println("check if checkbox is selected? " + CheckBox.isSelected());

        //Close the browser
        driver.close();
    }
}
