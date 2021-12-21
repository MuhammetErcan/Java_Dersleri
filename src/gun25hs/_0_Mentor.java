package gun25hs;

import java.util.Scanner;

public class _0_Mentor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 10; i++) {
            int sayi = scanner.nextInt();
            toplam+=sayi;
        }
        int ort=toplam/10;
        System.out.println("ortalama= " +ort);
    }
}
