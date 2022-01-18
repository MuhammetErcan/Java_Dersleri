package gun42.Extend2;

public class Main {
    public static void main(String[] args) {


    Kamyon kamyon =new Kamyon();
    kamyon.model=2010;
    kamyon.turu=Turu.KAMYON;
    kamyon.yukKapasitesi=2000;

    Otomobil otomobil = new Otomobil();
    otomobil.model=2010;
    otomobil.turu=Turu.OTOMOBIL;
    otomobil.marka="BMW";

    Otobus otobus = new Otobus();
    otobus.model=2010;
    otobus.turu=Turu.OTOBUS;
    otobus.yolcuKapasitesi=150;


    /*
    Arac(türü enum, model)
        kamyon (yük kapasitesi)
        otomobil (marka)
        otobüs(yolcukapasitesi)

        Kamyon otomobil otobüs aracı extend edecek

        arac constructor deneyin
     */


    }
}
