package gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Bir ögretmen icin istedigi kadar not girebilecegi ve notlari girdikten
        sonra ortalamayi gecen ogrenci sayisini bulan bir program yazin.
         */


        /*
        1- not girebilmesi lazim -> Scanner
        2- bir metot yapsak -> notGirisi(int not, ArrayList<Integer> liste)
        3- istedigi kadar not girebilmesi icin do-while döngüsü gerekli
        4- ögretmen evet dedigi sürece program devam etsin. Hayir dediginde de bitsin
        5- ortalamayiGecenler(ArrayList<Integer>list) adinda bir metot lazim
         */

        ArrayList<Integer>notlarListesi=new ArrayList<>();

        String cevap="";
        do {System.out.println("not girin");
            int not =scanner.nextInt();
            scanner.nextLine();
            notGirisi(notlarListesi,not);
            System.out.println("devam etmek istiyor musunuz");
             cevap = scanner.nextLine();
        }while (cevap.contains("evet"));

        ortalamayiGecenler(notlarListesi);


    }
    public static void notGirisi(ArrayList<Integer>list, int not){
        list.add(not);

    }
    public static void ortalamayiGecenler(ArrayList<Integer>list){
        int toplam=0;
        int gecenler=0;

        for (int i = 0; i < list.size(); i++) {
            toplam+=list.get(i);

        }
        int ortalama= toplam/list.size();


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)>ortalama)
                gecenler++;
        }
        System.out.println("gecenler = " + gecenler);
    }
}
