package gun13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        /*
        0-100 arası random bir sayı oluşturun. kullanıcıya 5 hak verin
        eğer doğru tahmin ederse tebrikler yazdırın. 5 inde de bilemezse oyunu kaybettiniz yazdırın.
         */
        Scanner scanner = new Scanner (System.in);
        int random = (int) ((Math.random()*100));
        int sayac=0;
        while (sayac<5){
            System.out.println("sayi girin");
            int num= scanner.nextInt();
            if (num==random) {

                System.out.println("tebrikler");
                break; // sayi doğr tahmin edilirse break döngüyü kırar ve program sonlanır
            }
            else if (sayac==4){    // 5. sayıda da bilemediğinde kaybettiniz yazdırması için bu satir var
                System.out.println("random = " + random);
                    System.out.println("kaybettiniz");
                }
                sayac++;
            }
        }

    }

