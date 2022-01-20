package gun43.ornek2;

public class Cember extends Sekil{
    double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    public double cevre(){
        return 2*Math.PI*yariCap;
    }

    public double alan(){
        throw new RuntimeException("cemberin alani yoktur hatasi");
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                "cevre= " + cevre() +
                '}';
    }
}
