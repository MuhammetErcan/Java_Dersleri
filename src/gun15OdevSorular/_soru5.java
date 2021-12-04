package gun15OdevSorular;

import java.util.Scanner;

public class _soru5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
        Kullanıcıdan bir metin girmesini isteyen ve bu metni tersten yazdıran programı yazınız.
        Input : Java ise Output: avaJ
         */
        System.out.println("bir kelime girin");
        String kelime = scanner.nextLine();

        for (int i = kelime.length()-1; i >= 0; i--) {
            char ters = kelime.charAt(i);
            System.out.print(ters);
        }
    }
}
