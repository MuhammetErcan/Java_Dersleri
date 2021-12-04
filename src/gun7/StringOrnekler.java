package gun7;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringOrnekler {
    public static void main(String[] args) {

        //1- ekrandan isminizi girin ve ilk harfinin boş  olup olmadığını kontrol edin

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("isminizi yazın= ");
        String isim= scanner.nextLine();
        System.out.println("isim = " + isim);
        System.out.println(isim.startsWith("A"));

        */

        // 2- soyisminizi ekrandan alın ve son harfininin k ile bitip bitmediğini kontrol edin

        /*System.out.println("Soyadınızı girin= ");
        String soyad = scanner.nextLine();
        System.out.println(soyad.endsWith("k"));

         */

        //3- ekrandan doğum yılınızı girin ve bu değişkenin boş olup olmadığını kontrol edin

        /*System.out.println("Doğum yılınızı girin= ");
        String dogumYili= scanner.nextLine();
        System.out.println(dogumYili.isEmpty());

         */

        // 4- ekrandan isim ve soy isminizi girinve isminizin ve soy isminizin bas harflerinden sonra . ekleyerek
        // arada bir boşluk olacak şekilde yazdırın   örnek çıktı: M.E.

       /* System.out.println("İsim ve soyisim girin= ");
        String isimSoyisim= scanner.nextLine();


        int boslukIndex= isimSoyisim.indexOf(" ");
        int soyadiIlkHarfIndex= boslukIndex+1;

        System.out.println(isimSoyisim.substring(0,1) + ". " + isimSoyisim.substring(soyadiIlkHarfIndex, soyadiIlkHarfIndex+1) + ".");

        */

        System.out.println("isminizi girin");
        String isim =scanner.nextLine();
        System.out.println("soyisminizi girin");
        String soyIsim= scanner.nextLine();

        String isimIlkHarf= isim.charAt(0) + ". ";
        String soyIsimIlkHarf = soyIsim.charAt(0) + ".";

        System.out.println(isimIlkHarf.concat(soyIsimIlkHarf));







    }
}
