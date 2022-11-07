package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void Setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL TrainingUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(TrainingUrl, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void Test1() {
        driver.get("https://www.training-support.net/");

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("About Us")));
        driver.findElement(AppiumBy.accessibilityId("About Us")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")));
        String PageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
        System.out.println(PageTitle);
        Assert.assertEquals(PageTitle, "About Us");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
