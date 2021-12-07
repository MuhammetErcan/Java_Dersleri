package gun16;

import java.util.Scanner;

public class _Calisma {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
       /*
        Kullanıcıdan 5 tane pozitif tam sayi girmesini isteyin.
        bu sayilari bir diziye atın. bu sayıların en büyüğünü ekrana yazdıın
         */
        int enb=0;
        int [] sayilar = new int[5];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("bir sayi girin");
            sayilar[i]= scanner.nextInt();

            if (sayilar[i]>enb){
                enb=sayilar[i];

            }

        }
        System.out.println("enb = " + enb);
        }
        }
