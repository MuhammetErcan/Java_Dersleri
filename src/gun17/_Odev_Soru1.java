package gun17;

import java.util.Scanner;

public class _Odev_Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
        Bu ögrencilere seviye belirleme sinavi yaptiniz.
        Aldiklari sonuclar su sekildedir: 80,85,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:

        ögrenci abdullah sinavdan 80 almistir.
        ögrenci cihat sinavdan 85 almistir.
        ögrenci fatma sinavdan 90 almistir.
        ögrenci harun sinavdan 96 almistir.
        ögrenci yasin sinavdan 100 almistir.
         /
         */
        String[] isimler = new String[5];
        int[] notlar = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("öğrencinin adını girin");
                isimler[i] = scanner.nextLine();

                for (int j = i; j <= i; j++) {
                    System.out.println("öğrencinin notunu girin");
                    notlar[j] = scanner.nextInt();
                }
                scanner.nextLine();
            }

            for (int i = 0; i < 5; i++) {
                System.out.print("öğrenci " + isimler[i] + " sınavdan " + notlar[i] + " almıştır. ");
                System.out.println();
            }

        }
    }
