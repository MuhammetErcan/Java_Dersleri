package gun8;

import java.util.Locale;
import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        // 1-  ekrandan doğum tarihini yıl olarak alın ve şu anki yyılı girin
        // yasınızı hesaplayın. ekrandan girişte harf yazmayan izin vermeyin

        /*System.out.println("şu anki yılı girin");

        int yil = scanner.nextInt();
        System.out.println("doğum yılınızı girin");
        int dogumYili= scanner.nextInt();
        int cevap = yil-dogumYili;
        System.out.println(cevap);

         */

        // 2- ekrandan isim ve soyisim tek satırda girin ismininizin tüm harflerini küçültün
        // soyisminizin sadece ilk hrfini küçültüp diğer harfleri büyültün.

       /* System.out.println("isim soyisim girin= ");
        String isimSoyisim = scanner.nextLine();

        int boslukIndex= isimSoyisim.indexOf(" ");
        String isim = isimSoyisim.substring(0,boslukIndex);
        String isimKucuk= isim.toLowerCase(Locale.ROOT);

        System.out.println(isimKucuk);

        String soyİsim=isimSoyisim.substring(boslukIndex+1);

        String soyİsimİlkHarfKucuk= soyİsim.substring(0,1).toLowerCase(Locale.ROOT);
        String soyİsimKalanBüyük= soyİsim.substring(1).toUpperCase(Locale.ROOT);
        String soyİsimTamami= soyİsimİlkHarfKucuk.concat(soyİsimKalanBüyük);

        System.out.println(soyİsimTamami);

        */

        // 3- ekrandan cemberin yarıcapını alıp çemberin çevresini hesaplayın
        // pi=3.14   formül=2.pi.yariçap
        //cemberin çevresi  karenin bir kenarına eşittir karenin alanını hesaplayın sonuç tam sayı olmalıdır.

        int yariCap= scanner.nextInt();
        double cevreCember= yariCap*2* 3.14;
        System.out.println("cevreCember = " + cevreCember);

        double kareKenar = cevreCember;
        int kareAlani = (int) (kareKenar*kareKenar);
        System.out.println("kareAlani = " + kareAlani);






    }
}
