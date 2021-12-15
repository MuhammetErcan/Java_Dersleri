package gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
         Bir ögretmen icin istedigi kadar not girebilecegi ve notlari girdikten
        sonra ortalamayi gecen ogrenci sayisini bulan bir program yazin.
         */

        /*
        1- not girebilmesi lazım -> Scanner
        2- bir metot yaapsak -> notGirisi(int not, ArrayList<Integer>liste)
        3- istediğimiz kadar not girebilmesi için do while döngüsü gerekli
        4-öğretmen evet dediği sürece prohram devam etsi n hayır dediğinde bitsin
        5- ortalamayiGecenler(ArrayList<Integer>list) adinda bir metot lazım
         */
        Scanner scannerNot = new Scanner(System.in);
        Scanner scannerEvetHayir = new Scanner(System.in);
        ArrayList<Integer> notlarListesi = new ArrayList<>();
        String cevap="";
        do {
            System.out.println("Not girin");
            int not = scannerNot.nextInt();
            notGirisi(not,notlarListesi);
            System.out.println("başka not girmek istiyor musun");
            cevap= scannerEvetHayir.next();

        }while (cevap.equalsIgnoreCase("evet"));

    }
    public static void notGirisi(int not, ArrayList<Integer>notlarListesi){
    notlarListesi.add(not);

    }
    public static void ortalamayiGecenler(ArrayList<Integer>notlarListesi){
        int toplam=0;
        int ortalama=0;
        int ortalamayiGecenSayisi=0;

        for (int i = 0; i < notlarListesi.size(); i++) {
            toplam+=notlarListesi.get(i);
        }
        ortalama=toplam/notlarListesi.size();
        for (int i = 0; i < notlarListesi.size(); i++) {
            if (notlarListesi.get(i)>ortalama)
                ortalamayiGecenSayisi++;

        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamayiGecenSayisi = " + ortalamayiGecenSayisi);
    }
}
