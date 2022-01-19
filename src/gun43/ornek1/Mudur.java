package gun43.ornek1;

public class Mudur extends Calisan {
    double makamKatsayi;

    public Mudur(String isim, int maas, double maasKatsayi, double makamKatsayi) {
        super(isim, maas, maasKatsayi);
        this.makamKatsayi = makamKatsayi;
    }

    public double maasHesapla(){

        return maas*maasKatsayi*makamKatsayi;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayi=" + maasKatsayi +
                ", makamKatsayi=" + makamKatsayi +
                '}';
    }
}
