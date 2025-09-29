package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Listeners(LoginTestWithRetry.ScreenshotListener.class)
public class LoginTestWithRetry {

    static WebDriver driver;
//    ScreenshotListener listener;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        listener=new ScreenshotListener();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    // Note the fully qualified RetryAnalyzer class name here:
    @Test(retryAnalyzer = LoginTestWithRetry.RetryAnalyzer.class)
    public void loginTest() {
        WebElement username = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement loginBtn = driver.findElement(By.name("login"));

        username.sendKeys("admin");
        password.sendKeys("admin123");
        loginBtn.click();

        String expectedUrl = "https://example.com/dashboard";
        assert driver.getCurrentUrl().equals(expectedUrl) : "Login failed!";
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static class RetryAnalyzer implements IRetryAnalyzer {
        private int retryCount = 0;
        private static final int maxRetryCount = 1;

        @Override
        public boolean retry(ITestResult result) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                System.out.println("Retrying test " + result.getName() + ", attempt " + (retryCount + 1));
                return true;
            }
            return false;
        }
    }
    
    // Listener to take screenshot on failure
    public static class ScreenshotListener implements ITestListener {

        @Override
        public void onTestFailure(ITestResult result) {
            try {
                if (driver != null) {
//                    File dir = new File("screenshots");
//                    if (!dir.exists()) dir.mkdirs();

                    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    Files.copy(file.toPath(), Paths.get("screenshots/" + result.getName() + ".png"));
                    System.out.println("Screenshot captured for failed test: " + result.getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
