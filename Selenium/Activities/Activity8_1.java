package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

       List<WebElement> row= driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("Number of Rows:"+row.size());

        List<WebElement> clos= driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("Number of clos:"+clos.size());
//Find and print the all the cell values of the third row of the table.

        List<WebElement> ThirdRow= driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        for(WebElement cellValue : ThirdRow) {
            System.out.println("Value of 3rd row:" + cellValue.getText());
        }
        WebElement Secondcell= driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("Value of 2nd Cell:" + Secondcell.getText());

        driver.close();
    }


}
