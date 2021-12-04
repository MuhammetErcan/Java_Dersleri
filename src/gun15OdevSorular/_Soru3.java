package gun15OdevSorular;

import java.util.Scanner;

public class _Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın. Daha sonra bu sayının
        çarpım tablosunu yazdırmalıdır.
         */
        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int carpim = sayi * i;
            System.out.println(sayi + "x " + i + "=" + carpim);
        }
    }
}
