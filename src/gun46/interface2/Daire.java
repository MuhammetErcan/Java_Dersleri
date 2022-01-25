package gun46.interface2;

public class Daire extends Cember{
    public Daire(double yariCap) {
        super(yariCap);
    }

    public double alanHesapla() {
        return Math.PI * yariCap * yariCap;

    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                '}';
    }
}
