package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        Select mulChoice = new Select(driver.findElement(By.id("multi-select")));
        WebElement choiceText = driver.findElement(By.id("multi-value"));

        if (mulChoice.isMultiple()) {
            mulChoice.selectByValue("node");
            System.out.println(choiceText.getText());

            mulChoice.selectByVisibleText("Javascript");
            System.out.println(choiceText.getText());

            for (int i = 4; i <= 6; i++) {
                mulChoice.selectByIndex(i);
            }
            System.out.println(choiceText.getText());

            mulChoice.deselectByIndex(7);
            System.out.println(choiceText.getText());

            List<WebElement> SelectedOptions=  mulChoice.getAllSelectedOptions();
            //print all selected Options
            for ( WebElement i :SelectedOptions){
                System.out.println("Selected Options: "+ i.getText());
            }
//Deselect
            mulChoice.deselectAll();
            System.out.println(choiceText.getText());
        }
    }
}
