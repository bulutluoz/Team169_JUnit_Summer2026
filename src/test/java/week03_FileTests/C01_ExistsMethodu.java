package week03_FileTests;

import org.junit.jupiter.api.Test;
import utils.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_ExistsMethodu {

    @Test
    public void test01(){

        // week03 icerisinde deneme.txt isminde bir dosya olusturun
        // bu dosyanin var oldugunu Java ile kontrol edin

        String dosyaYolu = "src/test/java/week03_FileTests/deneme.txt";

        System.out.println("deneme dosyasi var mi ? : " + Files.exists(Paths.get(dosyaYolu)));


        // olmayan veya yanlis bir dosya yolu verilirse

        String yanlisDosyaYolu = "src/test/java/week03_FileTests/deneme1.txt";

        System.out.println("deneme1 dosyasi var mi ? : " + Files.exists(Paths.get(yanlisDosyaYolu)));


        // bilgisayarinizdaki masaustu icerisinde denemeMasaustu.txt isminde bir dosya olusturun
        // bu dosyanin var oldugunu Java ile kontrol edin
        String masaustuDenemeDosyaYolu = "/Users/ahmetbulutluoz/Desktop/denemeMasaustu.txt";

        System.out.println("Masaustunde deneme dosyasi var mi ? : " +Files.exists(Paths.get(masaustuDenemeDosyaYolu)));


        String downloadsDenemeDosyaYolu = "/Users/ahmetbulutluoz/Downloads/denemeDownloads.txt";
        System.out.println("Downloads'da deneme dosyasi var mi ? : " +Files.exists(Paths.get(downloadsDenemeDosyaYolu)));


    }
}
