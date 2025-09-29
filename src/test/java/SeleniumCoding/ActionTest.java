//package SeleniumCoding;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeMethod;
//
//import java.security.Key;
//
//
//public class ActionTest {
//    WebDriver driver;
//    Actions actions;
//
//    @BeforeMethod
//    public void setup() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        actions=new Actions(driver);
//        /**
//         * Mouse Actions:
//         */
//        actions.moveToElement().perform();//(Mouse hover)
//        actions.dragAndDrop(sourceElement, targetElemnt).perform();// drag And drop
//        actions.doubleClick().perform();
//        actions.contextClick().perform();//right click
//
//
//        /**
//         * Keyboard Actions:
//         */
//
//        actions.sendKeys(Keys.ENTER).perform();
//        actions.sendKeys(Keys.CONTROL).sendKeys("a").perform(); //(Ctrl+A)
//        actions.sendKeys(element, "text").perform();
//
//        //another approach for select all
//        actions.keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(Keys.CONTROL)
//                .perform();
//
//    }
//}
