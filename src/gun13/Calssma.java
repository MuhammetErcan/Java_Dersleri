package gun13;

import java.util.Locale;
import java.util.Scanner;

public class Calssma {
    public static void main(String[] args) {
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