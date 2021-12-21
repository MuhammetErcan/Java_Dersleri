package gun26.task2;

import java.util.Scanner;

public class Okul {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Ogrenci[] ogrenciler= new Ogrenci[10];
        // 10 tane öğrenci oluşturdu



        int uzunluk = ogrenciler.length;
        System.out.println("uzunluk = " + uzunluk);



        for (int i = 0; i < ogrenciler.length ; i++) {
            Ogrenci ogrenci= new Ogrenci();
            System.out.println("öğrenci ismi");
            ogrenci.isim =scanner.nextLine();
            System.out.println("öğrenci soy ismi");
            ogrenciler[i].soyisim=scanner.nextLine();

            ogrenciler[i]=ogrenci;

        }

        // 2.yol
        for (int i = 0; i < ogrenciler.length; i++) {
            Ogrenci ogrenci = new Ogrenci();
            ogrenciler[i]=ogrenci;
            // ogrenciler dizisine önce bilgileri girilmemiş


            System.out.println("öğrenci ismi");
            ogrenciler[i].isim=scanner.nextLine();
            System.out.println("öğrenci soy ismi");
            ogrenciler[i].soyisim=scanner.nextLine();

        }
    }
}
