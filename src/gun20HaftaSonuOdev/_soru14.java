package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından girilen üç sayı arasından sırasıyla maksimum ve minimum sayıyı yazdırmak için iki
        method tanımlayın.
         */
        int [] sayilar = new int[3];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]= scanner.nextInt();
        }

        enkSayi(sayilar);
        enbSayi(sayilar);


}
public static void enkSayi (int[] sayi){
    for (int i = 0; i < sayi.length; i++) {
    }
    Arrays.sort(sayi);
    int enk=sayi[0];
    System.out.println("enk = " + enk);
}
    public static void enbSayi (int[] sayi){
        for (int i = 0; i < sayi.length; i++) {
        }
        Arrays.sort(sayi);
        int enb=sayi[sayi.length-1];
        System.out.println("enb = " + enb);
}}







