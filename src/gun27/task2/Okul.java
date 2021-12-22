package gun27.task2;

public class Okul {
    public static void main(String[] args) {
        Ogrenci og1 = new Ogrenci(); // nesne oluşturdum
        og1.name="Ali";
        og1.number=100;

        og1.konus();
        og1.adiniSoyle();

        Ogrenci og2 = new Ogrenci();
        og2.name="Veli";
        og2.number=100;
        og2.konus();
        og2.adiniSoyle();
    }
}
