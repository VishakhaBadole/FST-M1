package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5 {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User Login to page$")
    public void setup(){
        driver=new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("User entered \"(.*)\" and \"(.*)\"$")
    public void Login(String Usernames, String Password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(Usernames);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(Password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read title and \"(.*)\" message$")
    public void Print(String confirmation) {

      String msg=driver.findElement(By.id("action-confirmation")).getText();

        System.out.println(msg);
        Assert.assertEquals(msg,confirmation );

    }
    @And("^Close Browser$")
    public void tear(){
        driver.close();
    }
}
