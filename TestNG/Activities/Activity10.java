package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity10 {
    WebDriver driver;
    Actions builder;

    @BeforeClass(alwaysRun = true)
    public void OpenUrl() {
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        Reporter.log("Starting Test |");
        driver.get("https://www.training-support.net/selenium/sliders");
        Reporter.log("title is " + driver.getTitle() + "|");
    }

    @Test(priority = 0)
    public void MiddleSlider() {
        WebElement slider = driver.findElement(By.cssSelector("input#slider"));
        slider.click();
        String Volume = driver.findElement(By.cssSelector("span#value")).getText();
        Assert.assertEquals(Volume, "50");
    }

    @Test(priority = 1)
    public void RightSlider() {
        WebElement slider = driver.findElement(By.cssSelector("input#slider"));
        builder
                .clickAndHold(slider)
                .moveByOffset(100, 0)
                .build().perform();

        String Volume = driver.findElement(By.cssSelector("span#value")).getText();
        Assert.assertEquals(Volume, "100");

    }

    @Test(priority = 2)
    public void LeftSlider() {
        WebElement slider = driver.findElement(By.cssSelector("input#slider"));
        builder
                .clickAndHold(slider)
                .moveByOffset(-100, 0)
                .build().perform();

        String Volume = driver.findElement(By.cssSelector("span#value")).getText();
        Assert.assertEquals(Volume, "0");

    }

    @Test(priority = 3)
    public void Slider30Perc() {
        WebElement slider = driver.findElement(By.cssSelector("input#slider"));
        builder
                .clickAndHold(slider)
                .moveByOffset(-30, 0)
                .build().perform();

        String Volume = driver.findElement(By.cssSelector("span#value")).getText();
        Assert.assertEquals(Volume, "30");

    }

    @Test(priority = 4)
    public void Slider80Perc() {
        WebElement slider = driver.findElement(By.cssSelector("input#slider"));
        builder
                .clickAndHold(slider)
                .moveByOffset(80, 0)
                .build().perform();

        String Volume = driver.findElement(By.cssSelector("span#value")).getText();
        Assert.assertEquals(Volume, "100");

    }


    @AfterTest
    public void tearDown() {
        Reporter.log("Ending Test |");
        //Close the driver
        driver.quit();
    }
}
