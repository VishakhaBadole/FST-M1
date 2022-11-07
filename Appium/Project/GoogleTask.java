package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class GoogleTask {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.noReset();
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        URL NativeUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(NativeUrl, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void Task1() {
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"New task\")")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Save\")")).click();

        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"New task\")")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Save\")")).click();

        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"New task\")")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Save\")")).click();

        List<WebElement> AllTasks = driver.findElements(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/task_name\")"));

        System.out.println(AllTasks.size());
        Assert.assertEquals(AllTasks.size(), 3);

        for (int i = 0; i < AllTasks.size(); i++) {
            WebElement CompletedTask = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_item_completed_check\")"));
            CompletedTask.click();
        }
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
