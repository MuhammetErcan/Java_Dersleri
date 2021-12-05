package gun15OdevSorular;

import java.util.Scanner;

public class _Soru12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcının istediği kadar sayıları girmek için bir program yazın ve sonunda program girilen
        en büyük ve en küçük sayıları göstermelidir. Önce kullanıcı kaç sayı gireceğini belirtecek, sonra sayılar
        girilecek.
         */
        System.out.println("kaç sayi girmek istiyorsunuz");
        int kacTane = scanner.nextInt();
        int enb=0;
        System.out.println("sayi girin");
        int enk = scanner.nextInt();

        for (int i = 0; i < kacTane-1; i++) {
            System.out.println("sayi girin");
            int sayi = scanner.nextInt();
            if (sayi>enb){
                enb=sayi;
            }
            if (sayi<enk){
                enk=sayi;
            }

        }
        System.out.println("enb = " + enb);
        System.out.println("enk = " + enk);




    }
}
