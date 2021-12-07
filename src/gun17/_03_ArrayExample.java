package gun17;

import java.util.Scanner;

public class _03_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        kullanıcıdan 5 sayi girmesini  isteyin bu sayilardan yüzler basamağı en yüksek olanı bulun
         */
        int [] sayilar = new int[5];
        int enb=0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("bir sayi girin");

        }
        for (int sayi : sayilar){   // foreach kalıbı
            int yüzler = (sayi/100)%10;
            if (yüzler>enb){
                enb=yüzler;
            }
        }
    }
}
