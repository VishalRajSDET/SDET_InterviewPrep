package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class SeleniumCode{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait
        WebElement button=driver.findElement(By.className("iblpc"));
        //wait.until(ExpectedConditions.elementToBeClickable(button));
        /**
         * Fluent wait
         */
        Wait<WebDriver> wait1=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement locator=wait1.until(ExpectedConditions.elementToBeClickable(By.className("iblpc")));
        button.click();
        List<WebElement> aTagElement=driver.findElements(By.tagName("a"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele=driver.findElement(By.className("gLFyf"));
        js.executeScript("arguments[0].value='T';", ele);
        aTagElement.size();
        driver.getTitle();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        driver.quit();
        button.submit();
//Questions complted till 118
   //     https://www.softwaretestingmaterial.com/selenium-interview-questions/

        Actions actions = new Actions(driver);

        // Simulate Ctrl + F to open the Find dialog
        actions.sendKeys(Keys.CONTROL + "f")  // Ctrl + F to open Find
                .perform();
    }
}
