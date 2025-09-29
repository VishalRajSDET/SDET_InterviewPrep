package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCode {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test() {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(@class,'FPdo')]/descendant::input[contains(@aria-label,'Feeling Lucky')]")).click();
        WebElement lib = driver.findElement(By.xpath("//a[@data-g-cta_text='Library']/parent::li[@class='glue-header__item glue-header__item']"));
        System.out.print("Print Lib text :" + lib.getText());

    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
