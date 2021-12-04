package gun10;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        /*
        kullanıcıdan yanyana aralarında bir boşluk olacak şekilde iki tam sayi isteyin. bunların tek mi
        çift mi olduğunu kontrol edin
         */

       /* System.out.println("aralarında boşluk olacak şekiilde iki tam sayı girin ");
        String sayilar =scanner.nextLine();
        int boslukIndex= sayilar.indexOf(" ");
        String ilkSayi= sayilar.substring(0,boslukIndex);
        String ikinciSayi = sayilar.substring(boslukIndex+1);

        int ilkSayiInt = Integer.parseInt(ilkSayi);
        int ikinciSayiInt = Integer.parseInt(ikinciSayi);


        if (ilkSayiInt%2==0 && ikinciSayiInt%2==0){
            System.out.println("her iki sayı da çift");
        }
        else if (ilkSayiInt%2==0 && ikinciSayiInt%2!=0 ) {
            System.out.println("ilk sayı çift ikinci sayı tek");
        }
        else if (ilkSayiInt%2!=0 && ikinciSayiInt%2==0){
            System.out.println("ilk sayi tek ikinci sayi çift");
        }
        else if (ilkSayiInt%2!=0 && ikinciSayiInt%2!=0){
            System.out.println("her iki sayi da tek");
        }

        */

        // kullanıcıdan bir sifre girmesini isteyin. sifre belli sartları sağlaması gerekiyor
        //1. en az 6 karakter olmalı
        //2. içinde pass yada sifre geçmemeli
        //3. en fazla 12 karakter olmalı
        // girilen sifre bu kurallara uyuyorsa ekrana sifre başarılı, değilse sifre basarisiz yazdırın

       /* System.out.println("şifre girin");
        String sifre = scanner.nextLine();

       if (sifre.length()>=6
       &&  !(sifre.contains("pass") || sifre.contains("sifre"))
       && sifre.length()<=12) {
           System.out.println("şifre başarılı");
       }
       else
           System.out.println("şifre başarısız");

        */

        /* kullanıcıdan ders ve aldığı notu alin Mat: 90 şeklinde
        >=90 için A
        >=80 için   B
        >=70 için  C
        >=60 için D
        >=50 için E
        <50 için F EKRANA YAZDIRIN
         */

        String dersVeNot= scanner.nextLine();
        int boslukIndex= dersVeNot.indexOf(" ");
        String not =dersVeNot.substring(boslukIndex+1);
        int notInt= Integer.parseInt(not);

        if (notInt>=90){
            System.out.println("A");
        }
        else if (notInt>=80){
            System.out.println("B");
        }
        else if (notInt>=70){
            System.out.println("C");
        }
        else if (notInt>=60){
            System.out.println("D");
        }
        else if (notInt>=50){
            System.out.println("E");
        }
        else if (notInt<50){
            System.out.println("F");
        }

    }
}
