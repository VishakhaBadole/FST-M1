package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity2 extends BaseClass{
    @Given("^User1 is on Login page$")
    public void HiturlMethod(){
driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("^User1 enters username and password$")
    public void LoginMethod(){
       driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("^Read1 the page title and confirmation message$")
    public void Geturlmsg(){
        String title = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        //Print the page title and heading
        System.out.println("Page title is: " + title);
        System.out.println("Login message is: " + confirmMessage);
    }


}
