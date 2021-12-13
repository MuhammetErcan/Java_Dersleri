package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan 10 tamsayı girişi alın ve bunları bir dizide saklayın. Yine kullanıcıdan bir sayı vermesini isteyin.
        Şimdi kullanıcıya bu sayının dizide olup olmadığını söyleyin.
         */
        int[] sayilar = new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=scanner.nextInt();
        }
        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt();
        int miktar=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayi==sayilar[i])
                miktar++;
        }
        if (miktar==0)
            System.out.println("girdiğiniz sayı dizide yoktur");
        else
            System.out.println("dizide girdiğiniz sayı vardır.");

}

}

