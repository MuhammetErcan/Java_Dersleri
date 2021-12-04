package gun10Haftasonu;


import java.util.Scanner;

public class _04Ornek_2Cozüm1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int saat;
        String indirimKarti;


        System.out.print("Park süresi (saat) : ");
        saat = sc.nextInt();
        // eger tek Scanner nesnesi ile önce sayi, pesine String okutulacak ise (sc.nextLine)
        // int okututulduktan sonra satirin enter kisimin okunmasi inin bos bir sc.nextLine() eklenir.
        // aksi takdirde okunmasi gereken text metin okunmadan atlanir
        // önce String sonra sayi okunacak ise buna gerek yok
        // ya da int ve String farkli Scannerlar ile okunabilir.
        sc.nextLine();
        System.out.print("Indirim karti var mi? ('Y', 'N') : ");
        indirimKarti = sc.nextLine();

        double fiyat = 0;
        if (saat <= 2) {
            fiyat = 5;
            if (indirimKarti.toUpperCase().equals("Y"))
                fiyat = 5 * 0.8;

        } else if (saat <= 5) {
            fiyat = 10;
            if (indirimKarti.equalsIgnoreCase("Y"))
                fiyat = 10 * 0.8;

        } else {
            fiyat = 15;
            if (indirimKarti.equalsIgnoreCase("Y"))
                fiyat = 15 * 0.8;
        }
        System.out.println("Borcunuz : " + fiyat);
    }
}