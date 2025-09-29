package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Note-> Frames are used for vertically & horizontally splitting screen. page can be split multiple section but in case of
//IFrames are used to insert content from other sources for ex. on current page if we are opening some external resource then that is called IFrame.
//IFrame examples like advertisement page
public class FrameAndIframe {
    WebDriver driver;

    @BeforeClass
    void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test1() {
        driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
//        int iframeSize=driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Number of iFrames present in page :"+iframeSize);
        driver.findElement(By.xpath("//button[text(),'Run ❯'])")).click();

        driver.switchTo().frame("iframeResult");//frame parameter can we id or name or web element
        driver.findElement(By.linkText("Visit W3Schools.com!")).click();//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Visit W3Schools.com!"}
        //because of this  Visit W3Schools.com! text is present in iframe so to avoid this exception we need to switch to iFrame

        driver.switchTo().parentFrame();
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

}
