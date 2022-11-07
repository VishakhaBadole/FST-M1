package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/");
        String title= driver.getTitle();
        System.out.println(title);

       WebElement AboutUs =driver.findElement(By.id("about-link"));
        System.out.println("Print About Us  By Id>>"+AboutUs.getText());
//className()
        WebElement AboutUsByClass =driver.findElement(By.className("inverted"));
        System.out.println("Print About Us  By className >>"+AboutUsByClass.getText());

        WebElement AboutUsBycss =driver.findElement(By.cssSelector("a.green"));
        System.out.println("Print About Us By CSS >>"+AboutUsBycss.getText());
//linkText()
        WebElement AboutUsBylink =driver.findElement(By.linkText("About Us"));
        System.out.println("Print About Us By linktext >>"+AboutUsBylink.getText());



        driver.quit();
    }
}
