package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
    WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void OpenUrl() {
        driver = new FirefoxDriver();
        Reporter.log("Starting Test |");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("title is " + driver.getTitle() + "|");
    }

    @BeforeMethod

    public void defaultWindow() {
        Reporter.log("Test Case setup to default  |");
driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void SimpleAlerts() {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");
        Alert SimpleAlert =driver.switchTo().alert();
        Reporter.log("Switch to Alert |");
        String AlertText =SimpleAlert.getText();
        Reporter.log("Simple Alert Text is |"+AlertText+ "|");
        Assert.assertEquals("This is a JavaScript Alert!", AlertText);
        SimpleAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended |");
    }

    @Test(priority = 1)
    public void ConfirmAlerts() {
        Reporter.log("ConfirmAlertTestCase() started |");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened |");
        Alert ComplexAlert =driver.switchTo().alert();
        Reporter.log("Switch to Alert |");
        String AlertText =ComplexAlert.getText();
        Reporter.log("Simple Alert Text is |"+AlertText+ "|");
        Assert.assertEquals("This is a JavaScript Confirmation!", AlertText);
        ComplexAlert.dismiss();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void PrompAlerts() {
        Reporter.log("PromptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");
        Alert promptAlert =driver.switchTo().alert();
        Reporter.log("Switch to Alert |");
        String AlertText =promptAlert.getText();
        Reporter.log("Simple Alert Text is |"+AlertText+ "|");
        Assert.assertEquals("This is a JavaScript Prompt!", AlertText);
        promptAlert.sendKeys("Awesome!");
        Reporter.log("Alert Text entered");
        Reporter.log("Test case ended |");
    }

    @AfterTest
    public void tearDown() {
        Reporter.log("Ending Test |");
        //Close the driver
        driver.quit();
    }
}
