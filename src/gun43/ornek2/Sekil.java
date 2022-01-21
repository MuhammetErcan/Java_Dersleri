package gun43.ornek2;

public class Sekil {

    protected double alanHesapla(){
        throw new RuntimeException("Bu seklin Alani hesaplanamaz");
    }

    protected double cevreHesapla(){
        throw new RuntimeException("Bu seklin Cevresi hesaplanamaz");
    }

}