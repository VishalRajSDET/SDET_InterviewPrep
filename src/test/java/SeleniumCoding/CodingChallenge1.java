package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CodingChallenge1 {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //get current population
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    void test1() {
        driver.get("https://www.worldometers.info/world-population/");
        int count = 1;
        while (count <= 5) {
            List<WebElement> ele = driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
            for (WebElement getEle : ele) {
                System.out.println("get Current population" + getEle.getText());
            }
            count++;
        }
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

}
