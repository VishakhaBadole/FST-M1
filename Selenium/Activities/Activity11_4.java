package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Page Title is: " + driver.getTitle());

        String ParentWindow = driver.getWindowHandle();
        System.out.println("Parent title" + ParentWindow);

        WebElement Clickme = driver.findElement(By.id("launcher"));
        System.out.println(Clickme.getText());
        Clickme.click();

        Wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //Get Window handles
        Set<String> AllWindow = driver.getWindowHandles();
        System.out.println("All window handles: " + AllWindow);
        for (String s : driver.getWindowHandles()) {
            driver.switchTo().window(s);
        }

        //Wait for page to load completely
        System.out.println("current tab " + driver.getWindowHandle());
        Wait.until(ExpectedConditions.titleIs("Newtab"));
        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
        Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("actionButton")));
        String NeTabTex = driver.findElement(By.cssSelector("a#actionButton")).getText();
        System.out.println("Second Tab text is: " + NeTabTex);

        //repeat 6-8
        driver.findElement(By.id("actionButton")).click();
        Wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        Set<String> AgainAll = driver.getWindowHandles();
        System.out.println("All windows" + AgainAll);
        for (String s : driver.getWindowHandles()) {
            driver.switchTo().window(s);
        }
        System.out.println("Final window is" + driver.getWindowHandle());
        Wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println(driver.getTitle());
        driver.switchTo().activeElement();
        String Tab2tEXT = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println(Tab2tEXT);
        driver.quit();
    }
}
