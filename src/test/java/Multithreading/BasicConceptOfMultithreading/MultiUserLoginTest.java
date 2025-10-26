package Multithreading.BasicConceptOfMultithreading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTestThread extends Thread {
    private String username;

    public LoginTestThread(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println("Starting test for: " + username + " on " + Thread.currentThread().getName());
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        // Just imagine these are your login steps
        System.out.println("Logging in as: " + username);
        // driver.findElement(...).sendKeys(username);
        // driver.findElement(...).click();

        driver.quit();
        System.out.println("Completed test for: " + username);
    }
}

public class MultiUserLoginTest {
    public static void main(String[] args) {
        LoginTestThread user1 = new LoginTestThread("user1@example.com");
        LoginTestThread user2 = new LoginTestThread("user2@example.com");
        LoginTestThread user3 = new LoginTestThread("user3@example.com");

        user1.start();
        user2.start();
        user3.start();

        /**
         * Explanation:
         *
         * Each thread runs its own login test.
         * Browser instances open in parallel (assuming machine/resources allow).
         * You’ll see logs interleaving between users (showing parallelism).
         */

        /**
         * Interview Tip
         *
         * “I’ve implemented multithreading in automation when I needed to execute tests concurrently —
         * for example, running login tests for multiple users or API calls in parallel.
         * I started with Java threads and later moved to ExecutorService for better management.”
         */

        /**
         * follow-up question
         * Is Creating Threads Manually (like we did) a Good Approach in Automation?
         *
         * 👉 Short answer:
         * ❌ No, not in real-world frameworks.
         * ✅ Yes, only for learning or quick POC (Proof of Concept).
         */
    }
}
