package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    //Include alwaysRun property on the @BeforeTest
    //to make sure the page opens
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups ={"HeaderTests"})
    public void HeaderTest1() {
        WebElement h3Tag3 = driver.findElement(By.id("third-header"));
        Assert.assertEquals(h3Tag3.getText(), "Third header");

        WebElement header5 = driver.findElement(By.id("third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
        String s=header5.getCssValue("color");
        System.out.println("Color of header5 is:"+ s);
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");

        WebElement button2 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    //Include alwaysRun property on the @AfterTest
    //to make sure the page closes
    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}