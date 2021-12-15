package gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        int [] intDizi = new int[5]; // kaç eleman tutacağını vermek zorunlu
        // kaç tane eleman tutacağını belirtmemize gerek yok

        ArrayList<Integer> integerArraylist = new ArrayList<>();
        // ınteger tipinde veri tutar


        ArrayList<String> stringsArrayList = new ArrayList<>();
        //String tipinde veri tutar
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        //boolean tipinde veri tutar
        ArrayList<Double> doubleArrayList =new ArrayList<>();
        // dounle tipinde veri tutar

        // Ders kaydedecek bir liste oluşturun.
        ArrayList<String> dersler =new ArrayList<>();
        dersler.add("Matematik"); // 0. indi
        dersler.add("türkçe");
        dersler.add("almanca");
        dersler.add("fizik");// 3. indis
        // List lere ekleme yaparken hep en sona ekler

        System.out.println("dersler = " + dersler);  // Listlerde Arrays.toString() metoduna gerek yok.

        dersler.add(3,"ingilizce"); // Direkt indexe ekleme   --> add
        System.out.println("3. indise ingilizce ekledikten sonra dersler = " + dersler); //[Matematik, türkçe, almanca, ingilizce, fizik]


        String trDersi = dersler.get(1);  // Liste içerisindeki elemani index degeri ile cekme   --> get
        System.out.println("trDersi = " + trDersi);

        dersler.set(4,"kimya");   // Liste içerisindeki bir indexteki veriyi değiştirmek için kullanılır.  --> set
        System.out.println("dersler = " + dersler);

        int uzunluk =dersler.size(); // Listenin uzunluğunu verir yani eleman sayısını verir.   -->size
        System.out.println("uzunluk = " + uzunluk);

        boolean listBosMu = dersler.isEmpty();// Listenin boş olup olmadığını kontrol eder  -->isEmpty
        System.out.println("listBosMu = " + listBosMu);


        dersler.remove("almanca"); // Belirtilen değeri listeden siler     -->remove
        System.out.println("almanca silindikten sonra dersler  = " + dersler);

        dersler.remove(1); // indedx e veri silme
        System.out.println("1. indexteki veri silindikten sonra dersler = " + dersler);

        int index = dersler.indexOf("kimya");  // Verilen değerinin indexini bulmaya yarar  -->indexOf
        System.out.println("index = " + index);


        // for döngüsü ile yazdırma
        for (int i = 0; i < dersler.size(); i++) {
            System.out.print(dersler.get(i)+ " ");
        }


        dersler.clear(); // Listedeki tüm verileri siler    --> clear
        System.out.println("dersler = " + dersler);


    }
}
