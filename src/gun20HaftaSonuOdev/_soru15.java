package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Verilen bir sayının çift mi yoksa tek mi olduğunu bulan bir program tanımlayın.
         */
        int sayi =scanner.nextInt();
        tekSayi(sayi);
}
public static void tekSayi (int sayi){
        if (sayi%2==0)
            System.out.println("sayi çifttir");
        else
            System.out.println("sayi tektir");

}
}







