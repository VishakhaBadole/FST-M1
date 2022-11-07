package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/input-events");
        String title= driver.getTitle();
        System.out.println(title);


        WebElement cube= driver.findElement(By.xpath("//div[@id='D3Cube']"));


        actions.click(cube);
        WebElement cubeval= driver.findElement(By.className("active"));
        System.out.println("left Click: " + cubeval.getText());

        actions.doubleClick(cube).perform();
        cubeval= driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeval.getText());

        actions.contextClick(cube).perform();
        cubeval= driver.findElement(By.className("active"));
        System.out.println("right Click: " + cubeval.getText());

        driver.close();
    }



    }

