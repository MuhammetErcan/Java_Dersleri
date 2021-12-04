package gun15OdevSorular;

import java.util.Scanner;

public class _soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan bir tam sayı girmesini isteyen ve ardından sayıları ters çevrilmiş sayıyı veren
        bir program yazın.
        Input: 12345 ise Output: 54321
         */
        System.out.println("bir tam sayi girin");
        int sayi = scanner.nextInt();
        String str = String.valueOf(sayi);

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
