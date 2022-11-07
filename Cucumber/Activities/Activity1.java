package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepDefinitions.BaseClass.driver;
import static stepDefinitions.BaseClass.wait;

public class Activity1 {

    @Given("^User is on Google Home Page$")
    public void googlepage() {
//        WebDriver driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void googleSearch() {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);

    }

    @Then("^Show how many search results were shown$")
    public void googleSearchCount() throws Throwable {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultscounts = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number od results" + resultscounts);


    }

}
