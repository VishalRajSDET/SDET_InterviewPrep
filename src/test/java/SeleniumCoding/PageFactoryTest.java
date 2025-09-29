package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class PageFactoryTest {

    /**
     * Page Factory is an extension of the Page Object Model (POM) that provides an easier and more readable way to initialize web elements using annotations like @FindBy.
     * It's part of the org.openqa.selenium.support.PageFactory class in Selenium.
     */

    /**
     *
     * Why Use Page Factory?
     *
     * Without Page Factory, you might write code like:
     *
     * WebElement loginButton = driver.findElement(By.id("login"));
     * loginButton.click();
     *============================================================
     * But with Page Factory, you write:
     *
     * @FindBy(id = "login")
     * WebElement loginButton;
     * loginButton.click(); // After initialization
     *
     * Cleaner, more maintainable, and decouples your element locators from your test logic.
     */
    WebDriver driver;
    @FindBy(id="login")
    WebElement webElement;

    @AfterMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        webElement.click();
        PageFactory.initElements(driver,this);
    }
}
