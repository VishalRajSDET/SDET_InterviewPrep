package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WebDriverWaitAndFluentWait {
    public static void main(String[] args){

        /**
         * While WebDriverWait and FluentWait might look similar, they are not exactly the same. WebDriverWait is actually a subclass of FluentWait.
         * This means WebDriverWait is a specific implementation of FluentWait with some default behaviors, while FluentWait offers more granular control and customization.
         *
         * The Relationship: WebDriverWait Extends FluentWait
         * Think of it like this:
         *
         * FluentWait is the general contractor 🏗️. It provides all the tools and flexibility to build a custom waiting mechanism. You can specify everything: the maximum time, how often to check, and what types of problems (exceptions) to ignore while waiting.
         *
         * WebDriverWait is a specialized construction crew 👷. It uses the FluentWait's tools but comes with some predefined settings suitable for WebDriver (like automatically ignoring NoSuchElementException). It's designed to be convenient for common Selenium waiting scenarios.
         *
         * So, every WebDriverWait is a FluentWait, but not every FluentWait is a WebDriverWait
         */

        /**
         * Interview Explanation Example:
         * "While both WebDriverWait and FluentWait are used for explicit synchronization in Selenium,
         * WebDriverWait is actually built on top of FluentWait. The main differences lie in their default behaviors and the level of customization they offer.
         *
         * Defaults: WebDriverWait comes with a default polling interval of 500 milliseconds and automatically ignores NoSuchElementException.
         * This makes it very convenient for most common scenarios. FluentWait, on the other hand, requires you to explicitly define both the polling interval using pollingEvery() and any exceptions you want to ignore using ignoring().
         *
         * Customization: If I need highly granular control over the waiting mechanism – for example, a very specific polling frequency,
         * or if I need to ignore exceptions other than just NoSuchElementException (like StaleElementReferenceException during a retry loop) – then FluentWait provides that additional flexibility. It's particularly useful for defining very complex, custom waiting conditions beyond what's available in the standard ExpectedConditions.
         *
         * In most day-to-day automation tasks, WebDriverWait is perfectly sufficient and easier to use due to its sensible defaults.
         * However, when faced with trickier synchronization challenges or unique application behaviors, FluentWait is the more powerful tool."
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(day));
//        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[aria-label='Day']")));
//
//        FluentWait<WebDriver> waitFluentWait = new FluentWait<>(driver);
//        waitFluentWait.pollingEvery(Duration.ofSeconds(2))
//                .withTimeout(Duration.ofSeconds(10))
//                .ignoring(NoSuchElementException.class)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("")));


    }
}
