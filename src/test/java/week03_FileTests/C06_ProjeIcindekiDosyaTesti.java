package week03_FileTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_ProjeIcindekiDosyaTesti {

    @Test
    public void projeIcindekiDosyaTesti() {
        // proje icerisindeki week03 package'i altinda
        // deneme.txt dosyasinin oldugunu test edin

        String projeDosyaYolu = System.getProperty("user.dir");
        String herkesteOrtakOlanDosyaYolu = "src/test/java/week03_FileTests/deneme.txt";

        String dosyaYolu = projeDosyaYolu + "/" + herkesteOrtakOlanDosyaYolu;

        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
