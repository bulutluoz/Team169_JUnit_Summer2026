package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utils.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_DosyaIndirmeTesti extends TestBase_Each {





   @Test
    public void test01() throws InterruptedException {
       //1. https://the-internet.herokuapp.com/download adresine gidelim.
       driver.get("https://the-internet.herokuapp.com/download");

       //2. Image.png dosyasını indirelim
       driver.findElement(By.xpath("//*[text()='Image.PNG']")).click();

       Thread.sleep(2000);


       //3. Dosyanın başarıyla indirildiğini test edelim
       String downloadsDosyaYolu = "/Users/ahmetbulutluoz/Downloads/image.png";

       Assertions.assertTrue(Files.exists(Paths.get(downloadsDosyaYolu)));

   }


}
