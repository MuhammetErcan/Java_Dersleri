package gun46.abstract2;

public class Cember extends Sekil{
    double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*PI*yariCap;
    }

    @Override
    double alanHesapla() {
        throw new ArithmeticException("cemberin alani olmaz");
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                '}';
    }
}
