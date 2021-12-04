package gun15OdevSorular;

import java.util.Scanner;

public class _Soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        İlk 10 doğal sayının toplamını bulan programı yazınız.
         */

        int toplam =0;
        for (int i = 0; i < 10; i++) {
            toplam+=i;

        }
        System.out.println( toplam);
    }
}
