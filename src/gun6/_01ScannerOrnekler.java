package gun6;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _01ScannerOrnekler {
    public static void main(String[] args) {
        // Ekrandan 2 kelimelik bir yazı yazın

       Scanner scanner = new Scanner(System.in);
       /*
        System.out.println("2 keliime girin");
        String text = scanner.nextLine();
        System.out.println("text = " + text);

        // ekrandan girdiğiniz bu iki kelimenin yerlerini değiştirip ekrana yazdırın

        int boslukIndex = text.indexOf(" ");
        String ilkKisim =text.substring(0,boslukIndex);
        String ikinciKisim= text.substring(boslukIndex+1);

        System.out.println(ikinciKisim + " " + ilkKisim);

        */

        // Dikdörtgenin kısa ve uuzn kenarlarını  ekrandan alıp çevresini bulun

        /*int kisaKenar= scanner.nextInt();
        System.out.println("kisaKenar");
        int uzunKenar = scanner.nextInt();
        System.out.println("uzunKenar");
        int cevre = (kisaKenar+uzunKenar)*2;
        System.out.println("Dikdörtgenin çevresi= " + cevre);

         */

        // şu anki yılı ve doğum tarihinizi ekrandan alıp yaşınızı hesaplayın.

        System.out.println("Şu anki yıl= ");
        int suAn = scanner.nextInt();
        System.out.println("doğum yılı= " );
        int dogumYili = scanner.nextInt();
        int yas= suAn-dogumYili;

        System.out.println("yas = " + yas);









    }
}
