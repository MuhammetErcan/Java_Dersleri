package gun43.ornek2;

public class Kare extends  Dikdortgen{

    public Kare(int uzunluk) {
        super(uzunluk, uzunluk);
    }

    @Override
    public double cevre() {
        return 4*uzunluk;
    }

    public double alan(){
        return uzunluk*uzunluk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunluk=" + uzunluk +
                ", cevre="+ cevre()+
                ", uzunluk="+uzunluk+
                '}';
    }
}
