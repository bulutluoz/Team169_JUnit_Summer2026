package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_DosyaExistsTesti {

@Test
public void test01(){
    // proje icerisindeki week03 package'i altinda
    // deneme.txt dosyasinin oldugunu test edin

    String dosyaYolu = "/Users/ahmetbulutluoz/Desktop/MyDesktop/VideoDersler/Java/Team169_JUnitFramework/src/test/java/week03_FileTests/deneme.txt";


    Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    // Java'daki exists method'u true veya false sonucu dondurur
    // eger dosyanin var oldugunu test etmek isterseniz exists true dondurmeli,
    // dosyanin yok oldugunu test etmek isterseniz exists false dondurmeli

}



    @Test
    public void test02() {
        // bilgisayardaki downloads icinde
        // denemeDownloads.txt dosyasinin olmadigini test edin

        String downloadsDenemeDosyaYolu = "/Users/ahmetbulutluoz/Downloads/denemeDownloads.txt";

        Assertions.assertFalse(Files.exists(Paths.get(downloadsDenemeDosyaYolu)));

    }

}
