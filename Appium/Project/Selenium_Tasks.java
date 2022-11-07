package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class Selenium_Tasks {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void Setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setAppPackage("com.android.chrome");
        options.noReset();
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 0)
    public void AddTask() throws InterruptedException {
        driver.get("https://www.training-support.net/selenium");

        driver.findElement(
                AppiumBy.androidUIAutomator("UiScrollable(UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"To-Do List\"))"));
        driver.findElement(AppiumBy.androidUIAutomator("text(\"To-Do List\")")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("resourceId(\"taskInput\")")));
        driver.findElement(AppiumBy.androidUIAutomator("text(\" Clear List\")")).click();
        WebElement item = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"taskInput\")"));
        item.click();
        item.sendKeys("Add tasks to list");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("text(\"Add Task\")")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

        item.click();
        item.sendKeys("Get number of tasks");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("text(\"Add Task\")")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

        item.click();
        item.sendKeys("Clear the list");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("text(\"Add Task\")")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Get number of tasks\")")).click();
//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add tasks to list\")")).click();

        //print all items

        List<WebElement> AllTasks = driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id='tasksList']/android.view.View/android.widget.TextView"));
        System.out.println(AllTasks.size());
        Assert.assertEquals(AllTasks.size(), 3);


        for (WebElement i :AllTasks) {

            System.out.println(i.getText());
            i.click();
        }

        driver.findElement(AppiumBy.androidUIAutomator("text(\" Clear List\")")).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
