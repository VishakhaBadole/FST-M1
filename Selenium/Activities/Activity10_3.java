package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        Actions builder= new Actions(driver);

        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());
        WebElement ball =driver.findElement(By.id("draggable"));
        WebElement DROP1 = driver.findElement(By.id("droppable"));
        WebElement  Drop2 =driver.findElement(By.id("dropzone2"));

        Action move1 = builder.clickAndHold(ball).moveToElement(DROP1).release().build();
        move1.perform();
        System.out.println(DROP1.getText()+DROP1.getCssValue("color"));

        Action move2 = builder.clickAndHold(ball).moveToElement(Drop2).release().build();
        move2.perform();
        System.out.println(Drop2.getText()+Drop2.getCssValue("color"));
    }
}
