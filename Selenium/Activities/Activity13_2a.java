package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2a {
    public static void main(String[] args) throws Exception {
        String filepath = "src/test/java/resources/sample.xlsx";

        Activity13_2a obj = new Activity13_2a();

        obj.WriteExcel(filepath);
        obj.read(filepath);
    }

    public void WriteExcel(String filepath) throws Exception {
        XSSFWorkbook Workbook = new XSSFWorkbook();
        XSSFSheet sheet = Workbook.createSheet("Sheet1");

        List<String[]> data = new ArrayList<String[]>();

        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "as"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};


//Add it to the List
        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);

        int rowNum = 0;
        for (String[] rowdata : data) {
            Row row = sheet.createRow(rowNum++);
            int cellnum = 0;
            for (String celldata : rowdata) {
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue(celldata);
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(new File(filepath));
            Workbook.write(out);
            out.close();
            Workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read(String filepath) {
        try {
            FileInputStream ExcelFile = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
            XSSFSheet Sheet = workbook.getSheet("Sheet1");

            Iterator<Row> rowItr = Sheet.iterator();
            while (rowItr.hasNext()) {
                Row row = rowItr.next();
                Iterator<Cell> CellItr = row.cellIterator();
                while (CellItr.hasNext()) {
                    Cell cell = CellItr.next();
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue() + "\t");
                            break;
                        default:
                            System.out.println("invalid input");
                            break;
                    }
                }
                System.out.println(">>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
