package gun5;

public class Odev2 {
    public static void main(String[] args) {
        /*1. Bir String değişkeni tanımlayın. Değişkenın degerine (mesela: Ali)göre
 consola "Selam Ali!" yazdıracak.
2. Verilen bir String değerinin ilk yarısını ekrana yazdırınız.
String str = “Java”;
Çıktı : Ja
3. Verilen bir String değerinin ikinci yarısını ekrana yazdırınız.
String str = “Java”;
Çıktı : va
4. Verilen bir String değerinin ilk ve son harflerini ekrana yazdırın.
String str = “Java”;
Çıktı : Ja
5. Bir String tanımlayın. Tüm metin kücük harflerden oluşsun. Bulmanız gereken ilk harfin son geçtiği indexi bulmak
String str = “bilgisayar budur”;
ilk harf “b” olduğundan en son bulunan “b” nin indexini consola yazdırınız.

6. Girilen metnin ilk ve son harflerinin yerlerini değiştirip yeni bir string oluşturup ekrana yazınız
String str = “Java”;
Çıktı : aavJ
7.  Girilen metnin ilk yarısı ile ikinci yarısının yerlerini değiştirerek yeni bir string oluşturup ekrana yazınız
String str = “Java nasıl”;                Çıktı : nasılJava
String str = “telekominikasyon”;        Çıktı : nikasyontelekomi

         */


        // 1 - 
        String ilk = "Selam Muhammet";

        System.out.println("ilk = " + ilk);
        
        // 2- 
        String isim = "Muhammet";
        
        int ilkKarakterIndex = 0;
        int isimYarisiIndex = isim.length()/2;
        String isimYarisi= isim.substring(ilkKarakterIndex,isimYarisiIndex);
        System.out.println("isimYarisi = " + isimYarisi);

        // 3-  String isim = "Muhammet"

        String ikinciYari = isim.substring(isimYarisiIndex);
        System.out.println(ikinciYari);

        // 4-   String isim = "Muhammet"


        char ilkHarf = isim.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
        
        int sonHarfIndex = isim.length()-1;
        char sonHarf = isim.charAt(sonHarfIndex);
        System.out.println("sonHarf = " + sonHarf);
        
        // 5- 
        String cümle = "kitap okumak insanı geliştirmektedir";
        char ilkHarfCümle = cümle.charAt(0);
        int sonGectigiYerIndex = cümle.lastIndexOf(ilkHarfCümle);
        System.out.println("sonGectigiYerIndex = " + sonGectigiYerIndex);

        // 6- String isim = "Muhammet"

        int ilkHarfIsimIndex = 0;
        char ilkHarfIsim= isim.charAt(ilkHarfIsimIndex);
        int sonHarfIsimIndex = isim.length()-1;
        char sonHarfIsim = isim.charAt(sonHarfIsimIndex);
        int ortaBaslangicIndex= ilkHarfIsimIndex+1;

        String ortaIsim = isim.substring(ortaBaslangicIndex,sonHarfIndex);
        System.out.println("ortaIsim = " + ortaIsim);
        
        String cevap6 = sonHarfIsim+"".concat(ortaIsim).concat(ilkHarfIsim+"");
        System.out.println("cevap6 = " + cevap6);

        // 7- String isim = "Muhammet"
        // int isimYarisiIndex = isim.length()/2;
        String cavap7 = isim.substring(isimYarisiIndex).concat(isim.substring(0,isimYarisiIndex));
        System.out.println("cavap7 = " + cavap7);




    }
}
