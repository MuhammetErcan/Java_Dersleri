package gun46.interface2;

public class Dikdortgen implements ISekil {
    int uzunluk;
    int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunluk + genislik);
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}
