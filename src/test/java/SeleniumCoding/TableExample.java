package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage containing the table
        driver.get("http://path/to/your/webpage.html");

        // Assuming the table has id="dataTable"
        WebElement table = driver.findElement(By.id("dataTable"));

        // Get all rows from the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate through the rows and print cell contents
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t"); // Print each cell value
            }
            System.out.println(); // Move to the next line for the next row
        }

        // Close the browser
        driver.quit();
    }
}

