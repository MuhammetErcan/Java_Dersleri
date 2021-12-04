package gun12;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        /*
        kullanıcıdan 5 sayi isteyin
        Busayiların en büyüğünü ekrana ayzdırın
         */

        Scanner scanner =new Scanner(System.in);

        int ayrac =0;


        while (ayrac<5){
            System.out.println("sayi girin");
            int sayi = scanner.nextInt();
            int enk = sayi;

            if (sayi<enk){
                enk=sayi;
            }
            ayrac++;
        }
        System.out.println("en küçük= ");

    }
}
