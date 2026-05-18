package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DosyaYolunuDinamikYapma {

    @Test
    public void projeIcindekiDosyaTesti(){
        // proje icerisindeki week03 package'i altinda
        // deneme.txt dosyasinin oldugunu test edin

        //String dosyaYolu = "/Users/ahmetbulutluoz/Desktop/MyDesktop/VideoDersler/Java/Team169_JUnitFramework/src/test/java/week03_FileTests/deneme.txt";

        /*
            Dosya yolu incelendiginde
            bas kisminin kullanilan bilgisayara ait bilgiler
            son kismindaki proje ismi ile baslayan bolumun ise HERKES ICIN ORTAK bilgiler oldugu gorulecektir

            EGER kodun hangi bilgisayarda calistirilirsa
            o bilgisayardaki ortak proje uzerinden calismasi istenirse
            dosya yolu DINAMIK HALE getirilmelidir

         */

        // String bilgisayaraOzelBolum = "/Users/ahmetbulutluoz/Desktop/MyDesktop/VideoDersler/Java/Team169_JUnitFramework";
        // bilgisayara ozel bu bolumu Java uzerinden dinamik hale getirebiliriz.

        String bilgisayaraOzelBolum = System.getProperty("user.dir");
        // System.out.println("Bilgisayara ozel bolum : " + bilgisayaraOzelBolum);
        String herkesteOrtakOlanBolum = "src/test/java/week03_FileTests/deneme.txt";

        String dosyaYolu = bilgisayaraOzelBolum + "/" + herkesteOrtakOlanBolum;

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
