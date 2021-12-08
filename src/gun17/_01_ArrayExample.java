package gun17;

import java.util.Scanner;

public class _01_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        kullanıcıdan 5 tane sayı alın ve syıarın tek olanlarını bir diziye atın.
         */


        int[] sayilar = new int[5];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("bir sayi girin");
            sayilar[i] = scanner.nextInt();

        }
        int miktar =0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==1){
                System.out.println(sayilar[i]);
                miktar++;
            }

        }
        System.out.println("miktar = " + miktar);

    }

    }

