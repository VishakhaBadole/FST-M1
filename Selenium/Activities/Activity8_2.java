package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> clo = driver.findElements(By.xpath("//table[contains(@class, 'sortable ')]/thead/tr/th"));
        System.out.println("Number of coloum:" + clo.size());

        List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'sortable ')]/tbody/tr"));
        System.out.println("Number of rows are :" + row.size());

       WebElement Secondvalue= driver.findElement(By.xpath("//table[contains(@class, 'sortable ')]/tbody/tr[2]/td[2]"));
        System.out.println("second cell value :" + Secondvalue.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
        WebElement Sortedvalues= driver.findElement(By.xpath("//table[contains(@class, 'sortable ')]/tbody/tr[2]/td[2]"));
        System.out.println("print by Sortedvalues :" + Sortedvalues.getText());

        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());

        driver.close();

    }
}
