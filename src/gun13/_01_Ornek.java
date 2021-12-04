package gun13;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        /*
        kullanıcıdan isim girmesini isteyin ve kaç isim girmesini istediğini sorun
        kaç ismin baş harfi a ile başlıyor bunu bulun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç isim girmek istiyorsunuz =");
            int kacAdetIstiyor= scanner.nextInt();
            scanner.nextLine();
            int toplamSon=0;
            int sayac = 0;
            while (kacAdetIstiyor>sayac){
                System.out.println("isim giriniz=");
                String isim = scanner.nextLine();
                if (isim.startsWith("a")){
                    toplamSon++;
                }
                sayac++;
            }
            System.out.println("toplam son= " + toplamSon);
        }
    }

