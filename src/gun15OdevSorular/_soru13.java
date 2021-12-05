package gun15OdevSorular;

import java.util.Scanner;

public class _soru13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından girilecek n tamsayısı için aşağıdaki toplamını hesaplayan bir program
        yazın.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
         */
        System.out.println("bir tam sayi girin=");
        double sayi = scanner.nextInt();
        double toplam=0;

        for (double i = 1; i <= sayi; i++) {
            double istenen= 1/i;
            toplam = toplam +istenen;


        }
        System.out.println("toplam = " + toplam);
    }
}
