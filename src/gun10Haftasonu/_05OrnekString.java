package gun10Haftasonu;

import java.util.Scanner;

public class _05OrnekString {
    public static void main(String[] args) {


/*
Girilen bir metinin
    a.    ilk harfini consola yazdirin
    b.    son harfini consola yazdirin
    c.    ortadaki harfini consola yazdirin
    d.    metnin uzunlugunu ekrana yazdirin
 */
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    char ilkHarf = text.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
        char sonHarf = text.charAt(text.length()-1);
        System.out.println("sonHarf = " + sonHarf);
        char ortaHarf = text.charAt(text.length()/2);
        System.out.println("ortaHarf = " + ortaHarf);
        System.out.println("uzunluk = " + text.length());
    }
}
