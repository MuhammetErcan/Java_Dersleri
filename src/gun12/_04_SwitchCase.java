package gun12;

import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan 2 tamsayi alın
        yine kullanıcıdan yapmak istediği işlemleri yaptırın
        toplama için t çıkarma için c, çarmpa için p, bölme için b olacak
        bu soruyu switch-case ile yapın
                 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        int sayi1= scanner.nextInt();
        System.out.println("2. sayıyı girin");
        int sayi2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("yapmak istediğini işlemi girin");
        String islem = scanner.nextLine();

        switch (islem) {
            case "t":
                System.out.println(sayi1+sayi2);
                break;
            case "c":
                System.out.println(sayi1-sayi2);
                break;
            case "p":
                System.out.println(sayi1*sayi2);
                break;
            case "b":
                if (sayi2!=0)
                    System.out.println((double) sayi1/sayi2);
                else
                    System.out.println("tanımsız");

                break;
            default:
                System.out.println("geçersiz işlem");
        }





    }
}
