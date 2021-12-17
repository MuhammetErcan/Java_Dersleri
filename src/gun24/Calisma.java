package gun24;

import java.util.HashSet;
import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr= new Scanner(System.in);
        /*
        aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
          ciktisi bu sekilde olacaktir -> 3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.

         soru 2:

         Kullanicinin 1 ve ya 1 den fazla sayi girebilecegi ama tekrar eden sayilari
         kaydetmeyecek bir program yazin.
         */
        String cevap;
        HashSet<Integer>sayilar=new HashSet<>();
        do {

            System.out.println("bir syi girin");
            int sayi = scannerInt.nextInt();
            sayilarMetot(sayilar,sayi);
            System.out.println("Devam etmek istiyor mıusuuz");
            cevap=scannerStr.nextLine();
        }while (cevap.contains("evet"));
        System.out.println(sayilar);
    }
    public static HashSet<Integer> sayilarMetot(HashSet<Integer>sayilar, int sayi){
        sayilar.add(sayi);
        return sayilar;
    }

}
