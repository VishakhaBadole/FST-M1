package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is :" + driver.getTitle());

        //Find Toggle buttons
        WebElement dynamicText = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));

        toggleButton.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicText));

        ////Click the toggle button again
        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicText));

        dynamicText.click();

driver.close();
    }
}
