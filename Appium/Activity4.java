package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity4 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity("com.samsung.android.contacts.contactslist.PeopleActivity");
        options.setAppPackage("com.samsung.android.app.contacts");
        options.noReset();

        URL Test1 = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(Test1, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void test1() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Create contact")));
        driver.findElement(AppiumBy.accessibilityId("Create contact")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='Name']")));

        // Find the first name, last name, and phone number fields
        WebElement firstName = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Name']"));
        firstName.sendKeys("Aditya");
        WebElement Phone = driver.findElement(AppiumBy.androidUIAutomator("text(\"Phone\")"));
        Phone.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(AppiumBy.androidUIAutomator("//android.widget.EditText[@text='Phone']")));
        WebElement mobile = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']"));
        mobile.sendKeys("999148292");
        //save
        driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/smallLabel")).click();
    }
    public  void quit(){
        driver.quit();
    }
}
