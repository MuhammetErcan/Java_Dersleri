package gun46.interface2;

public class Cember implements ISekil{
    double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yariCap;
    }

    @Override
    public double alanHesapla() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                '}';
    }
}
