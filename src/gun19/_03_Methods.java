package gun19;

import java.util.Scanner;

public class _03_Methods {
    public static void main(String[] args) {
        /*
        kullanıcının gireceği saynın tek mi çift mi olduğunu bulan bir metot yazın
         */
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        tekMiCiftMi(sayi);
    }

    public static void tekMiCiftMi(int num) {
        if (num%2==1){
            System.out.println("sayi tektir");
        }
        else {
            System.out.println("sayi çifttir");
        }
    }
}
