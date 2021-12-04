package gun4;

public class _01_String {
    public static void main(String[] args) {
        System.out.println("bugün hava çok güzel");

        String mesaj = "bugün hava çok güzel";

        System.out.println(mesaj);

        String str = "";   //arada boşluk bırakmakla hiçbir şey bırakmamak farklı şeylerdir.

        System.out.println(str);

        String name = "aysenin elinde toplam";
        String mesaj2 = "para kalmıştır";

        int toplam = 10000;
        int tatil =5000;
        int hisse = toplam-tatil;
        int bankayaBorc= 3000;
        int arkadasinVerdigi = 4000;

        int kalanPara = toplam-tatil-hisse+arkadasinVerdigi-bankayaBorc;

        System.out.println(name+" " +kalanPara+" " +mesaj2);


    }

}
