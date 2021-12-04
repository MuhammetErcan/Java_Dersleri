package gun11;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        /*
        kullanıcıdan 1-9 arası bir sayi girmesini isteyin. 0-10 arası bir random sayi tanımlayın
        eğer kullanıcının girdiği sayi ile random sayı eşit ise ekrana tebrikler yazdırın. eğer cevap yanlış ise
        maalesef kaybettiniz yazdırın
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-9 arası bir sayi girin");

        int sayi = scanner.nextInt();
        int randomSayi = (int)(Math.random()*10);
        System.out.println("random sayi= " + randomSayi);

        if (sayi==randomSayi)
            System.out.println("tebrikler");
        else
            System.out.println("maalesef kaybettiniz");


    }
}
