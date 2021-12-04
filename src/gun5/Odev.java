package gun5;

public class Odev {
    public static void main(String[] args) {
       /*
       myStr isminde bir String tanımlayın ve initialize (ilk metni atayın) edin.
1) myStr'nin uzunluğunu bulun.
2) Baştaki, Sondaki ve Ortadaki karakterini bulup konsola yazdırın ve bu karakteri ve index'lerini farklı değişkenler tanımlayıp ilgili değişkenlere assign edin (atayın). (Örnek: int indexFirst; String charFirst; ...)
3) Bulduğunuz bu karakterleri concat methodu kullanarak birlestirin ve konsola yazdırın.
4) Bulduğunuz bu karakterlerin index'lerinin toplamını konsola yazdırın.
5) İşlemlerinizi yaparken el ile girilecek sabit olan sadece myStr'in textı olmalı. myStr değişkeninin metni değiştiğinde programınız hatasız çalışabilmeli. (düzenlendi)
[18:41]
Değeri "Java Kursu" olan str'nin ilk ve son karakterini concat ile birleştirmek için aşağıdaki kodu yazdım. Ancak kod hata veriyor.
1. Neden hata veriyor?
2. Çözüm yöntemi ne olabilir?

class Main {
  public static void main(String[] args) {
       String str = "Java Kursu";
       System.out.println(str.charAt(0).concat(str.charAt(str.length()-1)));
  }
} (düzenlendi)

AhmetT — 20.11.2021
Tanımlanan bir String içerisinde geçen ve değişken olarak verilen bir karakterin ilk bulunduğu yer ile son bulunduğu yer arasındaki substringin uzunluğunu bulunuz.
String str = “Java buralarda mı”;
String ch = “a”;

Output :    Metin: “va buralard”, uzunluğu: 11
ch = “r” olursa  Output :    Metin: “ala”, uzunluğu: 3
şeklinde çıktı vermeli
        */
    /*
    AhmetT — 20.11.2021
    Arkadaslar asagidaki kodu bir inceleyip fikirlerinizi yazar misiniz
        /*  char normalde integer'dir.
            mesela  'a' = 97'dir.
            a harfinin ASCII kodu 97
         */
        /*char ch1 = 'a';     //  'a' karakter tanimlamasi
        char ch2 = 97;      //  'a' karakter tanimlamasinin diger sekli.
        System.out.println(ch1);    // burada char olarak a yazar
        System.out.println(ch2);    // burada char olarak a yazar
        System.out.println(ch1 + ch2);  // burada aritmetik islem olmasi nedeni ile 97+97 yani 194 yazar
       */



        String myStr = "Sefiller romanı dünya klasiklerindendir";
      // 1-
        int uzunlukMyStr = myStr.length();

        System.out.println("uzunlukMyStr = " + uzunlukMyStr);
         // 2-
        int basKarakterIndex = 0;
        char basKarakter= myStr.charAt(basKarakterIndex);
        int ortaKarakterIndex = uzunlukMyStr/2;
        System.out.println("ortaKarakterIndex = " + ortaKarakterIndex);
        char ortaKarakter = myStr.charAt(ortaKarakterIndex);
        char sonKarakter =myStr.charAt(uzunlukMyStr-1);
        int sonKarakterIndex = uzunlukMyStr-1;

        System.out.println(" basKarakter = " + basKarakter + ","+ " ortaKarakter= " + "," + ortaKarakter + " sonKarakter= " + sonKarakter);

        // 3-       bir ifadeye +"" eklersen o ifade String bir ifade olur.
        //   1+"" demek int i stringe çevirmek demek
        System.out.println(basKarakter+"".concat(ortaKarakter+"")+"".concat(sonKarakter+""));

        // 4-
        System.out.println(basKarakterIndex+ortaKarakterIndex+sonKarakterIndex);

        // 5-belirtilen ifadede ilk ve son karakterler Char karakterler olduğu için hata veriyor.
        // concat ile birleştirmek için String ifadeler olmalı.
        // bir ifadeyi string yapmak için o ifadeye +"" eklenir.

        String str = "Java Kursu";

        System.out.println(str.charAt(0)+"".concat(str.charAt(str.length()-1)+""));



        /////////////////////////////////////////////
        // String myStr = "Sefiller romanı dünya klasiklerindendir";
        String harf = "e";
        int ilkGecen = myStr.indexOf(harf);
        int sonGecen = myStr.lastIndexOf(harf);
        System.out.println(ilkGecen+sonGecen);
        String araCumle = myStr.substring(ilkGecen+1, sonGecen);
        System.out.println(araCumle);
















    }
}
