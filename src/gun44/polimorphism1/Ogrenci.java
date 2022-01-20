package gun44.polimorphism1;

public class Ogrenci extends Insan{
    String okul;

    public Ogrenci(String adi, String okul) {
        super(adi);
        this.okul = okul;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", okul='" + okul + '\'' +
                '}';
    }
}
