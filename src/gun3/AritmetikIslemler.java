package gun3;

public class AritmetikIslemler {
    public static void main(String[] args) {
        //1.soru
        int ev =3;
        int pazar =2;

        int toplam = ev+pazar;

        System.out.println("toplam= " + toplam);

        //yada

        System.out.println("toplam=" + (ev+pazar));

        //2. soru


        double evFiyati = 200000;
        double taksitMiktari = 1200;

        double taksitSayisi = evFiyati / taksitMiktari;

        System.out.println(taksitSayisi);

        //3. soru

        int evdekiKola =20;
        int bendekiKola =12;
        int dokulenKola = 3 ;
        int kalanKola= evdekiKola+bendekiKola-dokulenKola;

        System.out.println("toplam kalan kola = "+ kalanKola );

        // 4.soru   //4.) Bir köyde 300 hane yasamaktadir. Yazin 50 hane koyden sehre tasinmistir.
        // Ayni yaz koye akraba ziyaretine 110 kisi gelmistir. Koyun toplam miktari ne kadardir?
        //Koyun önceki miktari su an ki miktarindan fayla midir?

        int koyhane=300;
        int tasinanHane=50;
        int yazinGelen=110;

        int sonMevcut= koyhane-tasinanHane+yazinGelen;
        System.out.println("son mevcut" + sonMevcut);

        boolean cevap= koyhane > sonMevcut;

        System.out.println("cevap" + cevap );

    }
}
