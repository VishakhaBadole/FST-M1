package Activities;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title is" + driver.getTitle());

//        Find the third header on the page.
        String H3text = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Header3 text is:" + H3text);

//      Find the fifth header on the page and get it's 'colour' CSS Property.
        String H5color = driver.findElement(By.cssSelector("h5.green")).getCssValue("color");
        System.out.println("Header5 color is :" + H5color);

//        Find the violet button on the page and print all the class attribute values.
        String violetButton = driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
        System.out.println("attributes is :" + violetButton);

//        Find the grey button on the page with Absolute XPath.
        String grayButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[3]/button[2]")).getAttribute("class");
        System.out.println("grabuttons attribute  is :" + grayButton);

        driver.quit();

    }
}
