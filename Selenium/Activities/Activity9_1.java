package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        Select  Choice = new Select(driver.findElement(By.id("single-select")));
        WebElement choiceText= driver.findElement(By.id("single-value"));

        Choice.selectByVisibleText("Option 2");
        System.out.println(choiceText.getText());

        Choice.selectByIndex(3);
        System.out.println(choiceText.getText());

        Choice.selectByValue("4");
        System.out.println(choiceText.getText());

        List<WebElement> options =Choice.getOptions();
        //print

        for ( WebElement i: options )
        {
            System.out.println("Options are here:" +i.getText());
        }
        driver.close();
    }
}
