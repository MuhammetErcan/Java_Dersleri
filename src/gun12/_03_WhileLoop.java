package gun12;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan 5 sayi isteyin
        Busayiların en büyüğünü ekrana ayzdırın
         */

        Scanner scanner =new Scanner(System.in);
        int enb =0;
        int i =0;

        while (i<5){
            System.out.println("sayi girin");
            int num = scanner.nextInt();

            if (num>enb){
                enb=num;
            }
            i++;
        }
        System.out.println("enb= " + enb);
    }
}
