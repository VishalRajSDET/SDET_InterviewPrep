package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class getAllBrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.amazon.com/");
//        List<String> urlList=new ArrayList<>();
//        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//        //Size of linkURL
//        System.out.println(allLinks.size());
//        for (WebElement link :allLinks){
//            String linkUrl=link.getAttribute("href");
//            verifyActiveLinks(linkUrl);
//        }
//    }
//    public static void verifyActiveLinks(String linkUrl){
//        try {
//            URL url=new URL(linkUrl);
//            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
//            Thread.sleep(2000);
//            httpURLConnection.connect();
//            int responseCode=httpURLConnection.getResponseCode();
//            if (responseCode>=400){
//                System.out.println(linkUrl +": is broken/InActive");
//            }else {
//                System.out.println(linkUrl +": is Valid/Active");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> elements=driver.findElements(By.tagName("a"));
        System.out.println("No of links present on page :"+elements.size());
        for(WebElement element:elements){
            String getLinkUrl=element.getAttribute("href");
            URL url=new URL(getLinkUrl);
            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
//           try {
//               Thread.sleep(2000);
//           }catch (Exception e){

//           }
            int statusCode=httpURLConnection.getResponseCode();
            if(statusCode>=400){
                System.out.println(getLinkUrl+" is a broken/Inactive Link");
            }else {
                System.out.println(getLinkUrl+" is a valid/Active Link");
            }
        }


    }
}
