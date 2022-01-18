package gun42.Extend2;

public class Otobus extends Arac{
    int yolcuKapasitesi;


    public Otobus(int model, Turu turu, int yolcuKapasitesi) {
        super(model, turu);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}
