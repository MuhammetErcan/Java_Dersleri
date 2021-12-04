package gun10Haftasonu;

import java.util.Scanner;

public class _02Ornek {
    public static void main(String[] args) {
        /*
        girilen iki tamsayıdan büyük olani ekrana yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1>sayi2){
            System.out.println(sayi1);
        }
        else {
            System.out.println(sayi2);
        }
    }
}
