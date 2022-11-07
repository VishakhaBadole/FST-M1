package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseClass {

    @Given("^user is on homepage$")
    public void homepage() {
        driver.get("https://www.training-support.net/");
    }
    @When("^user clicks the About Us page")
    public void Aboutpage() throws Throwable {
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^user redirect to the About Us page$")
    public void AboutpageTitle () throws Throwable {
        String title = driver.getTitle();
        System.out.println("redirected title is : " + title);
    }
}
