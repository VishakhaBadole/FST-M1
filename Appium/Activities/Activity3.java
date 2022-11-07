package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity(".Calculator");
        options.setAppPackage("com.sec.android.app.popupcalculator");
        options.noReset();

        URL Calc = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(Calc, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void Mul() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")));
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiplication")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String res = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("multiplication:"+ res);
        Assert.assertEquals(res, "10");

    }

    @Test
    public void Add() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")));
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.findElement(AppiumBy.accessibilityId("Addition")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        String res = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        System.out.println("Addition:"+ res);
        Assert.assertEquals(res, "7");

    }

    @Test
    public void Sub() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")));
        driver.findElement(AppiumBy.accessibilityId("7")).click();
        driver.findElement(AppiumBy.accessibilityId("Subtraction")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        String res = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        System.out.println("Subtraction:"+ res);
        Assert.assertEquals(res, "2");

    }

    public void div() {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")));
        driver.findElement(AppiumBy.accessibilityId("10")).click();
        driver.findElement(AppiumBy.accessibilityId("Division")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        String res = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        System.out.println("Division:"+ res);
        Assert.assertEquals(res, "2");

    }

    public  void quit(){
        driver.quit();
    }
}
