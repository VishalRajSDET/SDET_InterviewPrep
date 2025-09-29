package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //launch facebook page
        driver.get("https://www.facebook.com/");
        //click on create Account
        System.out.println(driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).getText());
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    //Select
    @Test
    void test1() {
        WebElement day = driver.findElement(By.cssSelector("select[aria-label=\"Day\"]"));
        WebElement month = driver.findElement(By.cssSelector("select[aria-label=\"Month\"]"));
        WebElement year = driver.findElement(By.cssSelector("select[aria-label=\"Year\"]"));
        //
        Select selectDay = new Select(day);
//        selectDay.selectByVisibleText("11");
//
//        //month
//        Select selectMonth = new Select(month);
//        selectMonth.selectByVisibleText("Oct");
//
//        //Year
//        Select selectYear = new Select(year);
//        selectYear.selectByVisibleText("2000");
//        System.out.println("Get year :"+ year.getText());
//        System.out.println("Test case passed");

        //Some more method
        selectDay.getFirstSelectedOption();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(day));
       WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[aria-label='Day']")));

        FluentWait<WebDriver> waitFluentWait = new FluentWait<>(driver);
        waitFluentWait.pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("")));


    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

}


