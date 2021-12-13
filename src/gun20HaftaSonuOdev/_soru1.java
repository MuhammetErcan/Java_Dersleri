package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan 10 tamsayı girişi alın ve bunları bir dizide saklayın ve ekrana yazdırın.
         */

        int [] sayilar = new int[10];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=scanner.nextInt();

        }
        System.out.println("sayilar = " + Arrays.toString(sayilar));
    }
}
