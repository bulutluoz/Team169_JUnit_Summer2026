package week02_JunitFramework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TestNotasyonu {

    // birbirinden BAGIMSIZ olarak calisabilen
    // 3 farkli test method'u olusturun
    // bu method'lar sirasiyla testotomasyonu.com, wisequarter.com ve youtube.com
    // adreslerine gidip, dogru adrese gittiklerini test etsinler.

    /*
        JUnit test method'larini sirali calistirmaz
        hangi method'un once calisacagini bilemeyiz

        @Disabled notasyonu bir test method'unun gecici olarak
        ignore edilmesi icin kullanilir
        genellikle bir test'de duzeltilmesi gereken bir hata oldugunda
        gecici olarak kullanilir, test duzeltildikten sonra @Disabled silinir

     */

    @Test
    public void testotomasyonuTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");

        String expectedUrl = "https://www.testotomasyonu.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Testotomasyonu testi PASSED");
        } else {
            System.out.println("Testotomasyonu testi FAILED");
        }
        driver.quit();
    }

    @Test
    public void wisequarterTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        String expectedUrl = "https://wisequarter.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("wisequarter testi PASSED");
        } else {
            System.out.println("wisequarter testi FAILED");
            System.out.println(driver.getCurrentUrl());
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
        }
        driver.quit();
    }

}
