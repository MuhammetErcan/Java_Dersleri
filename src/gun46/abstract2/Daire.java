package gun46.abstract2;

public class Daire extends Cember{
    public Daire(double yariCap) {
        super(yariCap);
    }

    public double alanHesapla() {
        return PI * yariCap * yariCap;

    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                '}';
    }
}
