package gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin.
        0 ile bu sayi arasindaki sayi dahil toplamini bulun
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayı giriniz");
        int sayi = scanner.nextInt();
        int toplam =0;

        while (0<sayi){
            toplam=sayi+toplam;
                sayi--;
            }
        System.out.println("toplam= "+ toplam);

    }
}
