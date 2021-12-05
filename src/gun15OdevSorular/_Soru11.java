package gun15OdevSorular;

import java.util.Scanner;

public class _Soru11 {
    public static void main(String[] args) {
        /*
        Kullanıcının istediği kadar sayıları girecek ve sonunda girilen pozitif, negatif ve sıfır sayısını
        göstermesi gereken bir program yazın.

         */
        Scanner scanner = new Scanner(System.in);
        int countPozitif=0;
        int countNegatif=0;
        int countSifir=0;
        System.out.println("kaç sayi girmek istiyorsubuz=");
        int kacSayi = scanner.nextInt();
        int sayi = 0;

        for (int i = 0; i <kacSayi ; i++) {
            System.out.println("sayi girin");
            sayi = scanner.nextInt();
        if (sayi>0)
            countPozitif++;
        if (sayi<0)
            countNegatif++;
        if (sayi==0)
            countSifir++;
        }

        System.out.println(countPozitif + "pozitif sayı vardır");
        System.out.println(countNegatif + "negatif sayı vardır");
        System.out.println(countSifir + "sıfır sayısı vardır");
    }
}

