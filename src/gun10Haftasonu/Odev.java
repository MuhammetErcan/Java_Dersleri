package gun10Haftasonu;

import java.util.Locale;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* 2-
       System.out.println("bir cümle giriniz= ");
        String text = scanner.nextLine();
                int ilkBoslukIndex = text.indexOf(" ");
        int sonBoslukIndex = text.lastIndexOf(" ");
        String ilkKelime = text.substring(0,ilkBoslukIndex);
        String sonKelime = text.substring(sonBoslukIndex+1);

        System.out.println(ilkKelime.toUpperCase(Locale.ROOT)   +   " " + sonKelime.toLowerCase(Locale.ROOT));
        */
        /* 3-
        System.out.println("cümle giriniz= ");
        String text = scanner.nextLine();
        text = text.trim();

        text= text.replaceAll("[ ]+"," ");
        System.out.println("text = " + text);

         */
        /*
        4-

        System.out.println("rastgele karakterler girin= ");
        String text = scanner.nextLine();
        String textMetin = text.toLowerCase(Locale.ROOT).replaceAll("[^a-z]","");
        String textSayi= text.replaceAll("[^0-9]","");

        System.out.println(textMetin);
        System.out.println(textSayi);
         */




        /* 5-
        int sayi = scanner.nextInt();
        if (sayi%2==0)
            System.out.println("sayi çifttir");
        else
            System.out.println("sayi tektir");
            */
        /* 6-
        int sayi = scanner.nextInt();
        int sayiBirler = sayi%10;
        if (sayiBirler==1)
            System.out.println(" bir" );
        if (sayiBirler==2)
            System.out.println(" iki" );
        if (sayiBirler==3)
            System.out.println(" üç" );
        if (sayiBirler==4)
            System.out.println(" dört" );
        if (sayiBirler==5)
            System.out.println(" beş" );
        if (sayiBirler==6)
            System.out.println(" altı" );
        if (sayiBirler==7)
            System.out.println(" yedi" );
        if (sayiBirler==8)
            System.out.println(" sekiz" );
        if (sayiBirler==9)
            System.out.println(" dokuz" );
                     */
        /* 7 -

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        int enBuyuk=sayi1;

        if (sayi2>enBuyuk)
            enBuyuk=sayi2;
        if (sayi3>enBuyuk)
            enBuyuk=sayi3;
        System.out.println("enBuyuk = " + enBuyuk);
        */
        /*8-
        int sayi = scanner.nextInt();
        if (sayi/10%10%2==0)
            System.out.println("çift");
        else System.out.println("tek");
                */
        /* 9 -
        System.out.println("vize notunu girin= ");
        int vize = scanner.nextInt();
        System.out.println("final notunu girin= ");
        int finalNot = scanner.nextInt();

        int ortalama= (vize*4/10) + (finalNot*6/10);
        System.out.println("ortalama = " + ortalama);

        if (ortalama>=60)
            System.out.println("geçtiniz");
        else
            System.out.println("kaldınız");
             */
        /* 10-
        System.out.println("kaç saat kaldığınızı girin= ");
        int saat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("akrtınız varsa 'V' yoksa 'Y' girin= ");
        String kart =scanner.nextLine();
        int ucret = 0;

        if (saat<=2)
            ucret=5;
        else if (saat<=5)
            ucret=10;
        else if (saat>5)
            ucret=15;
        if (kart.toLowerCase(Locale.ROOT).contains("v"))
            ucret= ucret*4/5;
        else  ucret=ucret;
        System.out.println("ucret = " + ucret);

         */
        /* 11-
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
        System.out.println((double) sayi1/sayi2);
         */
        /*
        System.out.println("saniye girin");
        int saniye = scanner.nextInt();
/*
        int sn = saniye%60;
        int saat = saniye/60;
        int dakika = saat%60;
        saat = saat / 60;
*/
        /*
        int saat = saniye/3600;
        int kalanZaman = saniye%3600;
        int dakika = kalanZaman/60;
        int sn = kalanZaman%60;

        System.out.println(saat+":"+dakika+":"+sn);
         */


















    }
}
