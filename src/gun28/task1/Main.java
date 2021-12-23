package gun28.task1;

public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap();
        kitap1.ad="Sefiller";
        kitap1.sayfaSayisi=1611;
        kitap1.basimYili=2011;

        kitap1.bilgileriniYaz();

        Kitap kitap2=new Kitap();
        kitap2.ad="Suç ve Ceza";
        kitap2.sayfaSayisi=1211;
        kitap2.basimYili=2011;

        kitap2.bilgileriniYaz();

        kitap(kitap1);
        kitap(kitap2);



    }
    public static void kitap(Kitap kitap){
        System.out.println("kitabın adı= " + kitap.ad);

    }
}

