package gun14;

import java.util.Scanner;

public class _01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tam sayi girmesini isteyin . bu sayıların karekökünü ekrana yazdırın.
        kullanıcı 0 girene kadar bu işlemi tekrarlayın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");
        int num =scanner.nextInt();

        do {
            System.out.println("sayi girin");
                    num = scanner.nextInt();
                    int karekok=(int)(Math.sqrt(num));
            System.out.println("karekok = " + karekok);

        }while (num!=0);
    }
}
