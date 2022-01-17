package gun41;

import java.util.Scanner;

public class _10Throw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5 ile 10 arasında sayi girin");
        int sayi1 = sc.nextInt();

        if (sayi1 < 5) {
            throw new ArithmeticException("hata");
        }
    }
}