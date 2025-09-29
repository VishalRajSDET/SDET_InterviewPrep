package SeleniumCoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

public class HandlingCookies {
    public static void main(String args[]){
//YT: https://youtu.be/G33Hh4IS8Wo?si=meQWS2xCaems9izw
        // A cookie is a small piece of data that is sent from a website and stored in your computer.
        // Cookies are mostly used to recognise the user and load the stored information.
        //WebDrvier API provides a way to interact with cookies with built-in methods.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");
        driver.manage().addCookie(new Cookie("user", "Vishal"));
        Cookie cookie= driver.manage().getCookieNamed("user");
        Set<Cookie> cookieSet=new HashSet<>(driver.manage().getCookies());
        System.out.println(cookieSet);
        System.out.println("My Cookie Name "+cookie);


        driver.manage().deleteCookieNamed("user");
        driver.manage().deleteAllCookies();
        System.out.println("After Cookies delete");
        Set<Cookie> cookieSet1=new HashSet<>(driver.manage().getCookies());
        System.out.println(cookieSet1);
        System.out.println("My Cookie Name "+cookie);
        driver.close();


    }
}
