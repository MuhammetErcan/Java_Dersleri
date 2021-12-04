package gun11;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("iki sayı girin");
        int sayi1 =scanner.nextInt();
        int sayi2 =scanner.nextInt();
        scanner.nextLine();
        System.out.println("işlemi girin");
        String harf = scanner.nextLine();


        if (harf.equalsIgnoreCase("t"))
            System.out.println(sayi1+sayi2);
        if (harf.equalsIgnoreCase("ç"))
            System.out.println(sayi1-sayi2);
        if (harf.equalsIgnoreCase("p"))
            System.out.println(sayi1*sayi2);
        if (harf.equalsIgnoreCase("b"))
            System.out.println( sayi1/sayi2);
    }
}
