package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class HandleMultipleWindow {
    WebDriver driver;

    @BeforeMethod
    void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test() {
        //launch facebook page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //wait for page load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//div[@class=\"orangehrm-login-footer-sm\"]/a[1]")).click();
        driver.findElement(By.xpath("//div[@class=\"orangehrm-login-footer-sm\"]/a[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"orangehrm-login-footer-sm\"]/a[3]")).click();
        driver.findElement(By.xpath("//div[@class=\"orangehrm-login-footer-sm\"]/a[4]")).click();

        Set<String> tabs = driver.getWindowHandles();

        for (String handel : tabs) {
            driver.switchTo().window(handel);
            System.out.println(driver.getTitle());
        }
        //If you want to move to Particular tab then we can move by index
//        Object[] windows = driver.getWindowHandles().toArray();
//       driver.switchTo().window((String) windows[1]);
//       driver.switchTo().window((String) windows[2]);
        ArrayList<String> win=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(win.get(0));
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
