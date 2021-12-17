package gun24;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Calisma2 {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr= new Scanner(System.in);
        /*
        aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
          ciktisi bu sekilde olacaktir -> 3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.

         */

        System.out.println(duzenlenmis("aaabbbfffgggtttddd"));



    }
    public static String duzenlenmis(String str) {

        int sayac = 0;

        String yeni="";
        TreeSet<Character> treeSet = new TreeSet<>();
        while (sayac< str.length()){
            String harf =String.valueOf(str.charAt(sayac));
            treeSet.add(str.charAt(sayac));

            sayac++;

            if(!yeni.contains(harf))
            yeni+=sayacMetot(str)+harf;

        }
        return yeni;
    }
    public static int sayacMetot(String str){
        int sayac = 0;
        TreeSet<Character> treeSet = new TreeSet<>();

        while (sayac< treeSet.size()){


            treeSet.add(str.charAt(sayac));
            sayac++;
        }
        return sayac;
    }
}
