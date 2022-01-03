package gun31.paket2;

public class Dikdörtgen {
    Boyut boyut=new Boyut();

    public void tanimla (Boyut boyut){
        this.boyut=boyut;
    }

    public void tanimla (int x, int y){

        boyut.x=x;
        boyut.y=y;
    }
    public double getCevre( ){
        double cevre = ((boyut.x+ boyut.y)*2);

        return cevre;
    }
    public double getAlan( ) {
        double alan=(boyut.x * boyut.y);

        return alan;
    }
}
