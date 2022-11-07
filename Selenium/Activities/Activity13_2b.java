package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2b {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title" + driver.getTitle());
        String filepath = "src/test/java/resources/sample.xlsx";
        Activity13_2b obj = new Activity13_2b();

        //Call read file method of the class to read data
        List<List<String>> FormInput = obj.read(filepath);

       List<String> entries;

   entries = FormInput.get(3);
        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys(entries.get(1));
        lastName.sendKeys(entries.get(2));

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(entries.get(3));
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(entries.get(4));

        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
      Alert msg=   driver.switchTo().alert();

        System.out.println(msg.getText());
        msg.accept();
    }

    public List<List<String>> read(String filepath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("sample1");

            Iterator<Row> rowitr = sheet.iterator();
            while (rowitr.hasNext()) {

                List<String> rowData = new ArrayList<String>();
                Row row = rowitr.next();
                Iterator<Cell> Cellitr = row.iterator();
                while (Cellitr.hasNext()) {
                    Cell cell = Cellitr.next();
                    if (row.getLastCellNum() == 5) {
                        rowData.add(cell.getStringCellValue());
                    }
                }
                data.add(rowData);
            }
            file.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
