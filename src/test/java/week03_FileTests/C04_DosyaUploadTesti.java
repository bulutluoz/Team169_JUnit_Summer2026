package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestBase_Each;

public class C04_DosyaUploadTesti extends TestBase_Each {

    @Test
    public void test01() throws InterruptedException {

        //https://the-internet.herokuapp.com/upload adresine gidelim

        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        //Yuklemek istediginiz masaustundeki denemeMasaustu.txt dosyasini secelim.

        /*
            Eger chooseFile butonuna basarsak
            otomatik olarak bilgisayarimizdaki dosya sistemi aciliyor
            VEEEEE selenium bizim kendi bilgisayarimizdaki dosya yapisini kullanmaz

            Selenium bunu cozmek icin
            sendKeys() method'una ozel bir islev eklemistir

            Eger chooseFile butonuna basmak yerine
            chooseFile butonuna yuklemek istediginiz dosyanin dosyaYolunu yollarsaniz
            direk o dosya secilecektir.
         */

        String masaustuDenemeDosyaYolu = "/Users/ahmetbulutluoz/Desktop/denemeMasaustu.txt";
        WebElement chooseFileButonu = driver.findElement(By.id("file-upload"));

        chooseFileButonu.sendKeys(masaustuDenemeDosyaYolu);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

        //“File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileUploadedYaziElementi = driver.findElement(By.tagName("h3"));

        String expectedText = "File Uploaded!";
        String actualText = fileUploadedYaziElementi.getText();


        Assertions.assertEquals(expectedText,actualText);

    }
}
