package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.checkerframework.checker.regex.qual.RegexBottom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity6 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.noReset();
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setAppPackage("com.android.chrome");

        URL URL = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(URL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void Test() {
        driver.get("https://www.training-support.net/selenium/lazy-loading");

        List<WebElement> Images = driver.findElements(AppiumBy.className("android.widget.Image"));
        System.out.println("Numbers of images :" + Images.size());

        //wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator(" new UiSelector().text(\"helen\")")));
        driver.findElement(AppiumBy.androidUIAutomator("UiScrollable(UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"helen\"))"));
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator(" new UiSelector().text(\"helen\")")));

        List<WebElement> AllImages = driver.findElements(AppiumBy.className("android.widget.Image"));
        System.out.println("Numbers of images After Scroll:" + AllImages.size());
        // Assertion after scrolling
        Assert.assertEquals(AllImages.size(), 3);
    }

    @AfterTest
    public void afterClass() {
        driver.quit();
    }

}
