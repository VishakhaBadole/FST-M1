package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Title:"+ driver.getTitle());
        driver.switchTo().frame(0);
        String Frame1Text = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Frame 1 text:" + Frame1Text);
        //get text and Color of button
        WebElement ClickButton = driver.findElement(By.id("actionButton"));
        System.out.println("Button text is :" + ClickButton.getText());
        System.out.println("Color of Button is:"+ ClickButton.getCssValue("background-color"));

        //find details for new button
        ClickButton.click();
        WebElement NewButton = driver.findElement(By.cssSelector("button.blue"));
        System.out.println("Text after clicking first button:"+ NewButton.getText());
        System.out.println("Color of Button after pressed is:"+ NewButton.getCssValue("background-color"));

        driver.switchTo().defaultContent();
        //Steps to new frame 2
        driver.switchTo().frame(1);

        String Frame2Text = driver.findElement(By.className("sub")).getText();
        System.out.println(Frame2Text);
        //get text and Color of button
        WebElement ClickMeButtonFrame2 = driver.findElement(By.id("actionButton"));
        System.out.println(ClickMeButtonFrame2.getText());
        System.out.println("Color of Frame 2 Button is:"+ ClickMeButtonFrame2.getCssValue("background-color"));

        //find details for new button
        ClickMeButtonFrame2.click();
        WebElement NewButton2 = driver.findElement(By.cssSelector("button.purple"));
        System.out.println(NewButton2.getText());
        System.out.println("Color of Button is:"+ NewButton2.getCssValue("background-color"));

        driver.close();
    }
}
