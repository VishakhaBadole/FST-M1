package stepDefinitions;
import io.cucumber.java.en.Then;

public class CloseClass extends BaseClass{
    @Then("^close the browser$")

    public void quitbrowser(){
        driver.quit();
    }

}
