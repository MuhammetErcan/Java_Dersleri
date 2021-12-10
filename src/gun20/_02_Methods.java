package gun20;

import java.util.Scanner;

public class _02_Methods {
    public static void main(String[] args) {
        /*
        iki sayının toplamını ekrana yazdırın
         */
        Scanner scanner =new Scanner(System.in);

        toplam();
    }

    public static void toplam() {
        Scanner scanner =new Scanner(System.in);
        int sayi1= scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int toplam= sayi1+sayi2;

        System.out.println("toplam = " + toplam);

    }
}
