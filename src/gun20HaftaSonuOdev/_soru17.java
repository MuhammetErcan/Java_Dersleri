package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından girilen iki sayının toplamını kendi metodunuzu tanımlayarak ekrana yazdıran programı
        yazınız
         */
        int sayi1= scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam =toplam(sayi1,sayi2);
        System.out.println("toplam = " + toplam);
}
public static int toplam(int a, int b){
        int toplam = a+b;
        return toplam;
}
}







