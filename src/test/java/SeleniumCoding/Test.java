package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\" Home\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[text()=\" Contact us\"]")).click();
        driver.findElement(By.xpath("//h2[text()=\"Get In Touch\"]")).isDisplayed();
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("vishal");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vishal@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"subject\"]")).sendKeys("Vishal raj");
        driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("Vishal raj1234");
        WebElement uploadEle = driver.findElement(By.xpath("//input[@type='file']"));
        uploadEle.sendKeys("C:\\Users\\Vishal Raj\\Downloads\\Columbia-Suicide_Severity_Rating_Scale__C-SSRS__-_Since_Last_Visit-v3.0-as-IN-v1.0.json");
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
        driver.quit();
        WebElement element=driver.findElement(By.xpath("//a[text()=\" Home\"]"));
        // imlicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //Explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //FluentWait
        FluentWait<WebDriver> waitFluentWait=new FluentWait<>(driver);
        waitFluentWait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoClassDefFoundError.class)
                .until(ExpectedConditions.elementToBeClickable(element));


    }
}
