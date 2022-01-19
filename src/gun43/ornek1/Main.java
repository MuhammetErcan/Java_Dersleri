package gun43.ornek1;

public class Main {


    /*
    Bir firma var firmada çalışanlar var
    calışan
        ismi
        maaş         (1000)
        maasKatsayi  (1.0,  1.5)

        maasHesapla() --> maaş*maaşKatsayisi

     müdür
        ismi
        maaş
        maasKatsayi     (1.0,  1.5)
        makamKatsayisi  (1.0,  1.5)

        maasHesapla() --> maas*maasKatsayisi*makanKatsayisi;


     Firmada 2 çalışan ve 1 müdür create edip maaşlarini heaplayin toString ile ekrana verilerini yazdırın

     */
    public static void main(String[] args) {
        Calisan calisan1= new Calisan("Ali",1000,1.0);
        Calisan calisan2= new Calisan("Veli",1000,1.5);

        Mudur mudur=new Mudur("hasan", 1200,1.5,1.5);

        System.out.println(calisan1.maasHesapla());
        System.out.println(calisan2.maasHesapla());


        System.out.println(mudur.maasHesapla());




    }

}
