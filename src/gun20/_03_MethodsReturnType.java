package gun20;

import java.util.Scanner;

public class _03_MethodsReturnType {
    public static void main(String[] args) {


    /*
        Kullanıcıdan 5 tane  sehir ,5 tane isim  ve 5 tane meyve  girmesini isteyin.Bunlardan
        Bunlardan kaç tanesinde e harfi olup olmadığını bulan metodu yazın.
         */
    int meyve = kacTanesindeEVar("meyve girin");
    int isim = kacTanesindeEVar("isim girin");
    int sehir = kacTanesindeEVar("sehir girin");

        System.out.println("Meyve = "+meyve);
        System.out.println("İsim = "+isim);
        System.out.println("sehir = "+sehir);
    }
    public static int kacTanesindeEVar(String str) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];

        int kacTanesindeE = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(str);
            array[i] = scan.nextLine();
            if (array[i].contains("e")) {
                kacTanesindeE++;
            }

        }
        return kacTanesindeE;

    }
}

