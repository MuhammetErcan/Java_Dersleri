package gun21;

import java.util.Scanner;

public class _05_MethodsExample {
    public static void main(String[] args) {
       /*
         Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
         her bir menü elemanını değer alan bir fonksiyon yazınız.
            1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
         Bir işlem seçiniz
        */
        menuYaz();
        islemYap(1);

    }

    public static void menuYaz() {
        System.out.println("***Menu***");
        System.out.println("1-toplama");
        System.out.println("2-cıkarma");
        System.out.println("3-carpma");
        System.out.println("4-bolme");
        System.out.println("5-faktoriyel");
        System.out.println("6-çıkış");
    }

    public static void islemYap(int islem) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        switch (islem) {
            case 1:
                System.out.println("1.sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                toplam(num1, num2);
                break;
            case 2:
                System.out.println("1.sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                cikarma(num1, num2);
                break;
            case 3:
                System.out.println("1.sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                carpma(num1, num2);
            case 4:
            case 5:
            case 6:
        }

    }

    public static void toplam(int num1, int num2) {
        System.out.println("toplam= " + (num1 + num2));
    }

    public static void cikarma(int num1, int num2) {
        System.out.println("cikarma=" + (num1 - num2));
    }

    public static void carpma(int num1, int num2) {
        System.out.println("carpma =" + (num1 * num2));

    }
}


