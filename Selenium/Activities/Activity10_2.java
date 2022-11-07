package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);


        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
       Action actionsToPerform = builder.sendKeys("W").build();
        actionsToPerform.perform();
        String keyPressedText = driver.findElement(By.id("keyPressNotify")).getText();
        System.out.println(keyPressedText);
        Action action2 = builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build();
        action2.perform();
        String keyPressedText2 = driver.findElement(By.id("keyPressed")).getText();
        System.out.println("Pressed key is: " + keyPressedText2);
    }
}
