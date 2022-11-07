package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.awt.*;

public class Activity3 extends BaseClass {
    Alert alert;

    @Given("^User is on the page$")
    public void Homepage() {
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the simple Alert button$")
    public void SimpleAlertPage() {
//        String SimpleAlert = driver.findElement(By.id("simple")).getText();
//        System.out.println("Simple Alert" + SimpleAlert);
        driver.findElement(By.id("simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void ConfirmAlertPage() {
//        String ConfirmAlert = driver.findElement(By.id("confirm")).getText();
//        System.out.println("Simple Alert" + ConfirmAlert);
        driver.findElement(By.id("confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void promptAlertPage() {
//        String promptAlert = driver.findElement(By.id("prompt")).getText();
//        System.out.println("Simple Alert" + promptAlert);
        driver.findElement(By.id("prompt")).click();
    }

    @Then("^Alert opens$")
    public void SwitchWindow() {
        alert = driver.switchTo().alert();

    }

    @And("^Read the text from it and print it$")
    public void ReadMsg() {
        System.out.println("Alert Message is :" + alert.getText());
    }

    @And("^Write a custom message in it$")
    public void writeMsgToAlert() {
        alert.sendKeys("Go Away Alert");
    }

    @And("^Close the alert with Cancel$")
    public void CloseWithCancel() {
        alert.dismiss();
    }

    @And("^Close the alert$")
    public void CloseAlert() {
        alert.accept();
    }


}