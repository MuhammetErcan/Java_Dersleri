package gun14;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt();
        int faktoriyel=1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;

        }
        System.out.println("faktoriyel = " + faktoriyel);

    }
}
