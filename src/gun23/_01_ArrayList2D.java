package gun23;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _01_ArrayList2D {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<ArrayList<Integer>> notlarTablosu = new ArrayList<>();

        String [] dersler = new String[3];
        dersler[0]= "matematik";
        dersler[1]="almanca";
        dersler[2]="fizik";

        ArrayList<Integer>matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(89);
        matNotlar.add(99);

        ArrayList<Integer>almancaNotlar = new ArrayList<>();
        almancaNotlar.add(66);
        almancaNotlar.add(78);
        almancaNotlar.add(89);

        ArrayList<Integer>fizikNotlar = new ArrayList<>();
        fizikNotlar.add(67);
        fizikNotlar.add(89);
        fizikNotlar.add(90);


        notlarTablosu.add(matNotlar);
        notlarTablosu.add(almancaNotlar);
        notlarTablosu.add(fizikNotlar);

        // tek bir listeyi yazdırma
        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println(matNotlar.get(i)+" ");

        }
        // tüm notlari yazdırma

        for (int i = 0; i < notlarTablosu.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarTablosu.get(i).size(); j++) {
                System.out.println((i+1)+".satirdaki " + (j+1)+ ".not = " + notlarTablosu.get(i).get(j));


            }

        }
/*
    Kullanıcının gireceği ders no suna göre ekrana o dersin notlarını yazdıran bir program yazin
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ders nolari= 0-mat, 1-almanca, 2-fizik");
        int dersNo =scanner.nextInt();
        dersNotu(notlarTablosu,dersNo);

    }

    // kullanıcının istediği dersin ortalamasını bulan programı yazın


    public static void dersNotu(ArrayList<ArrayList<Integer>> list, int dersNo) {
        System.out.println(list.get(dersNo));
    }
    public static void ortalamaBul (ArrayList<ArrayList<Integer>> list, int dersNo){
        int toplam=0;
        for (int i = 0; i < list.get(dersNo).size(); i++) {
            toplam+=list.get(dersNo).get(i);

        }
        int otalama = toplam/list.get(dersNo).size();
        System.out.println("otalama = " + otalama);

    }
}
