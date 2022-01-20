package gun43.ornek2;

public class Dikdortgen extends Sekil {

    int uzunluk;

    public Dikdortgen(int uzunluk, int genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    int genislik;

    public double cevre(){
        return 2*(uzunluk+genislik);
    }

    public double alan(){
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ", cevre="+ cevre()+
                ", uzunluk="+uzunluk+
                '}';
    }
}
