package week02_JunitFramework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeEach_AfterEach {
    /*
        @BeforeEach notasyonuna sahip olan method
        HER @Test method'undan once OTOMATIK olarak calisir
     */

    WebDriver driver;


    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println("Setup method calisti");
    }

    @AfterEach
    public void teardown(){
        driver.quit();
        System.out.println("Teardown method calisti");
    }

    @Test
    public void testotomasyonuTest(){

        driver.get("https://www.testotomasyonu.com");

        String expectedUrl = "https://www.testotomasyonu.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Testotomasyonu testi PASSED");
        } else {
            System.out.println("Testotomasyonu testi FAILED");
        }
    }

    @Test
    public void wisequarterTest(){

        driver.get("https://www.wisequarter.com");

        String expectedUrl = "https://wisequarter.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("wisequarter testi PASSED");
        } else {
            System.out.println("wisequarter testi FAILED");
            System.out.println(driver.getCurrentUrl());
        }
    }

    @Test
    public void youtubeTest(){
        driver.get("https://www.youtube.com");

        String expectedUrl = "https://www.youtube.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("youtube testi PASSED");
        } else {
            System.out.println("youtube testi FAILED");
        }
    }
}
