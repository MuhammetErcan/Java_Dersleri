package gun13;

import java.util.Scanner;

public class _05_whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*
    kullanıcıdan 5 tane pozitf tam sayi alın
    bu sayılardan en küçüğünü ekrana yazdırın
     */
        System.out.println("5 sayı giriniz= ");

       int enk = scanner.nextInt();
       int ayrac = 0;

       while (ayrac<4){
           System.out.println("sayi girin");
           int sayi = scanner.nextInt();
           if (sayi<enk){
               enk=sayi;
           }
           ayrac++;
       }
        System.out.println("enk = " + enk);
    }
}
