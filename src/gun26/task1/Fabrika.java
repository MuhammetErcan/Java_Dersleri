package gun26.task1;

public class Fabrika {
    public static void main(String[] args) {

        Otomobil otomobil1= new Otomobil(); // 1 tane otomobil1 oluşturmuş oldum
        // new Otomobil(); otomobil1 nesnesi üretir

        // bu otomobilin özelliklerini belirledim
        otomobil1.renk="Yesil";
        otomobil1.motorHacmi=2000;
        otomobil1.kacKapi=4;
        otomobil1.marka="BMW";
        otomobil1.modelYili=2021;

        otomobil1.arabaMarkaVeModel(otomobil1.marka, otomobil1.modelYili);
        // bu parametreler yerine örneğin String marka = "mercedes
        // ve int yil = 2000; yazabiliriz
        // otomobil1.arabaMarkaVeModel(marka, Yil);
        // ya da otomobil1.arabaMarkaVeModel("opel", 2010);


        Otomobil otomobil2= new Otomobil();

        otomobil2.marka="Mercedes";
        otomobil2.renk="Gri";
        otomobil2.modelYili=2010;
        otomobil2.kacKapi=5;
        otomobil2.motorHacmi=1200;



        Otobus otobus=new Otobus();


        otobus.marka="Mercedes";
        otobus.modelYili=2022;
        otobus.renk="mavi";
        otobus.motorHacmi=5000;

    }
}


