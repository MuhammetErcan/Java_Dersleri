package gun14;

import java.util.Scanner;

public class _03_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt();
        double faktoriyel=1; //

        for (int i=1; i<=sayi; i++){
            faktoriyel*=i;// faktoriyel=faktoriyel*i

        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
