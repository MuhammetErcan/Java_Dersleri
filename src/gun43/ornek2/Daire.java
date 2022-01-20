package gun43.ornek2;

public class Daire extends Cember{

    public Daire(double yariCap) {
        super(yariCap);
    }



    public double alan(){
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                "cevre=" + cevre() +
                "alan=" + alan()+
                '}';
    }
}
