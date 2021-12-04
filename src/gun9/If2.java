package gun9;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //  2- ekrandan şu anki yılı ve doğum tarihinizi girin
        //ve yaşınızı hesaplayın eğer yaşınız 18 den büyükse ehliyet alabilirisiniz
        //değilse ehliyet alamazsınız yazdırın.

       /* System.out.println("şu anki yılı girin");
        int yil = scanner.nextInt();
        System.out.println("doğum yılınızı girin");
        int dogum = scanner.nextInt();

        int yas= yil-dogum;
        System.out.println("yaşınız = "+yas);

        if (yas>18){
            System.out.println("ehliyet alabilirsiniz");
        }
        else {
            System.out.println("ehliyet alamazsınız");
        }

        */

        // 3- ekrandan girilen tkım gs ise ekrana yasa cimbom
        // girilen takım fener ise yasa fener
        //değilse kapat tv yi yazdırın.

        System.out.println("Takimini girin");
        String takim = scanner.nextLine();

        if (takim.equalsIgnoreCase("Galatasaray")){
            System.out.println("yasa cimbom");
        }
        else if (takim.equalsIgnoreCase("fenerbahce")){
            System.out.println("yasa fener");
        }
        else {
            System.out.println("kapat  tv yi");
        }


    }
}
