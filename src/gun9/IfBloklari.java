package gun9;

public class IfBloklari {
    public static void main(String[] args) {
        String str = "If ornekler";
        boolean b = str.equals("e");
        boolean c =str.equalsIgnoreCase(" ");
        boolean bb = str.isEmpty();
        boolean a = str.startsWith("e");
        boolean aa = str.endsWith("e");
        boolean cc= str.contains("c");

        int sayi1 =5;
        int sayi2 = 4;

        boolean sayiBoolean1 = sayi1==sayi2;
        boolean sayiBoolean2 = sayi1!=sayi2;
        boolean sayiBoolean3 = sayi1>sayi2;
        boolean sayiBoolean4 = sayi1<sayi2;
        boolean sayiBoolean5 = sayi1>=sayi2;
        boolean sayiBoolean6 = sayi1<=sayi2;


        //parantez içerisindeki ifadenin cevabı true ise if süslü parantezleri arası çalışır.

        if (sayi1==sayi2) {
            System.out.println( "iki sayı eşittir");
                    }
        else {
            //cevap false ise else süslü parantezleri arası çalışır.
            System.out.println("iki sayı eşit değildir.");
        }

        if (str.endsWith("e")) {
            // eşitlik kontrolü sadece sayılar arası yapılır. eğer string eşitliği kontrol edilecekse == yerine
            //equals() ya ad equelsIgnoreCase() kullanılır.
            System.out.println("e ile bitiyor");
        }
        else {
            System.out.println("e ile bitmiyor");

        }


    }
}
