package gun42.Extend2;

public class Kamyon extends Arac{
    int yukKapasitesi;

    public Kamyon(Turu turu, int model, int yukKapasitesi) {
        super(turu, model);
        this.yukKapasitesi = yukKapasitesi;
    }


}