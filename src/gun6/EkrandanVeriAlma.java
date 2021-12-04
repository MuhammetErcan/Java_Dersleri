package gun6;

import java.util.Scanner;

public class EkrandanVeriAlma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // String isim = sc.next();      --> tek kelime yazılır.
        //System.out.print("isminiz= "+ isim);

        //System.out.println("Bir cümle yazın");
        //String cümle =sc.nextLine();    // birden fazla kelime yazılabilir
        //System.out.println(cümle);
        /*

        System.out.println("1. Sayi= ");
        int a =sc.nextInt();
        System.out.println("2. sayi= ");
        int b = sc.nextInt();

        System.out.println("toplam = " + (a+b));
        */
        System.out.println("Dikdörtgenin ilk kenari");
        double a = sc.nextDouble();
        System.out.println("Dikdörtgenin ikinci kenarı");
        double b = sc.nextDouble();

        System.out.println("Dikdörtgenin alanı = " + (a*b));

        short s = sc.nextShort();
        byte bByte = sc.nextByte();
        float f = sc.nextFloat();
        long l = sc.nextLong();








    }
}
