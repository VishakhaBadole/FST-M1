package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleNote {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.noReset();
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        URL NativeURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(NativeURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void GoogleNote() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/editable_title")));
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys(" Activity2");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("This is Activity is to add Google Notes");
        //Add background theme
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/bs_background_button")));
        driver.findElement(AppiumBy.accessibilityId("Theme")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/color_picker_swatch")));
        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Colour Sand\"]/android.widget.ImageView")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Theme Groceries")));
        driver.findElement(AppiumBy.accessibilityId("Theme Groceries")).click();
        driver.navigate().back();
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.keep:id/browse_note_interior_content\")")));
        String NoteText= driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.keep:id/index_note_title\")")).getText();

        Assert.assertEquals( NoteText," Activity2");
        Thread.sleep(5000);
    }
    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
