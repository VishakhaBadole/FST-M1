package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main (String [] args) {

            WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String s = driver.getTitle();
        System.out.println("The Title is: " + s);
         driver.findElement(By.xpath("/html/body/div/div/div/a")).click();

        System.out.println(" New header  Title:  "+driver.getTitle());

        driver.close();
    }
}
