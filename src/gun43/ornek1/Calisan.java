package gun43.ornek1;

public class Calisan {
    String isim;
    int maas;
    double maasKatsayi;

    public Calisan(String isim, int maas, double maasKatsayi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayi = maasKatsayi;
    }

    public double maasHesapla(){

        return  maas*maasKatsayi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayi=" + maasKatsayi +
                '}';
    }
}
