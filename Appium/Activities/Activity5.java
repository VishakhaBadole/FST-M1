package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity5 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity("com.android.mms.ui.ConversationComposer");
        options.setAppPackage("com.samsung.android.messaging");
        options.noReset();

        URL URL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(URL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void test() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Compose new message")));
        WebElement SMS= driver.findElement(AppiumBy.androidUIAutomator(("description(\"Compose new message\")")));
        SMS.click();
        WebElement Number = driver.findElement(AppiumBy.androidUIAutomator(("resourceId(\"com.samsung.android.messaging:id/recipients_editor_to\")")));
        Number.sendKeys("7972478719");

        driver.findElement(AppiumBy.id("com.samsung.android.messaging:id/message_edit_text")).sendKeys("Hello Appium");

        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.samsung.android.messaging:id/selected_send_button1\")")).click();

        //wait
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hello Appium\")")));

        String PrintText= driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hello Appium\")")).getText();
        System.out.println("Here me!!"+PrintText);
    }
    public void  tear(){
        driver.quit();
    }
}
