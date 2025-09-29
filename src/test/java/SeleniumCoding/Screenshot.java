package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test() throws IOException {
        driver.get("https://www.youtube.com/");
        //Take full page screenshot
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f, new File("C:\\Users\\Vishal Raj\\JavaCodingPractice\\src\\Selenium\\homepage.png"));
        //Take screenshot for specific element
        File f2 = driver.findElement(By.xpath("//input[@name=\"search_query\"]")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f2, new File("C:\\Users\\Vishal Raj\\JavaCodingPractice\\src\\Selenium\\searchBar1.png"));
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }
}

