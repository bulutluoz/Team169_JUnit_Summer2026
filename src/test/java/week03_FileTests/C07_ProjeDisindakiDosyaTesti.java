package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_ProjeDisindakiDosyaTesti {

    @Test
    public void test01(){
        // bilgisayardaki downloads klasorunde
        // Image.png dosyasının bulundugunu test edin


        // dosya yolu  => /Users/ahmetbulutluoz/Downloads/Image.png

        String bilgisayaraOzelKisim = System.getProperty("user.home");
        String herkesteAyniOlanKisim = "Downloads/Image.png";

        String dosyaYolu = bilgisayaraOzelKisim + "/" + herkesteAyniOlanKisim;

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
