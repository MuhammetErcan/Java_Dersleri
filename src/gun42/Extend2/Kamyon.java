package gun42.Extend2;

public class Kamyon extends Arac {
    int yukKapasitesi;

    public Kamyon(int model, Turu turu, int yukKapasitesi) {
        super(model, turu);
        this.yukKapasitesi = yukKapasitesi;
    }
}
