package gun17;

import java.util.Scanner;

public class _01_ArrayMetodlari {
    public static void main(String[] args) {
        /*  --> split
        kullanıcıdan bir cümle yazmasını isteyin
        bu cümledeki harfleri kelime kelime bir diziye atın
        cümleyi tersten yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cüle gitin");
        String cumle = scanner.nextLine();
        String[] kelimeler = cumle.split(" ");
        // split() metodu içerisine verilen değere string ifadeyi böler

        for (int i = kelimeler.length; i >=0 ; i--) {
            System.out.println(kelimeler[i] + " ");

        }




    }
}
