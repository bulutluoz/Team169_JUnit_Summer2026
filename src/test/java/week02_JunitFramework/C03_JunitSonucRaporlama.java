package week02_JunitFramework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;

public class C03_JunitSonucRaporlama {


    @Test
    public void testotomasyonuTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");

        String expectedUrl = "https://www.aatestotomasyonu.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Testotomasyonu testi PASSED");
        } else {
            System.out.println("Testotomasyonu testi FAILED");
            throw new AssertionFailedError("actual url expected'dan farkli");

        }
        driver.quit();
    }

    @Test
    public void wisequarterTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        String expectedUrl = "https://www.wisequarter.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("wisequarter testi PASSED");
        } else {
            System.out.println("wisequarter testi FAILED");
            System.out.println(driver.getCurrentUrl());
            throw new AssertionFailedError("actual url expected'dan farkli");
        }
        driver.quit();
    }

    @Test
    public void youtubeTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        String expectedUrl = "https://www.youtube.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("youtube testi PASSED");
        } else {
            System.out.println("youtube testi FAILED");
            throw new AssertionFailedError("actual url expected'dan farkli");
        }
        driver.quit();
    }
}
