package gun37.ornek1;

public class Arac {
    /*
    private 3 değişken tanımlayın
    marka, model, fiyat,

    2 adet constructor yazın
    getter ve setter larını olulturun
    toString methodunu oluşturun.
    main metodu içinde bir nesne oluşturup
    uygun setterları uygun şekilde düzenleyin
     */


    private String marka;
    private int model;
    private int fiyat;


    public Arac(String marka, int model) {
        if (model>0) {
            this.marka = marka;
            this.model = model;
        }
    }

    public Arac(String marka, int model, int fiyat) {
        if (model>0) {
            this.marka = marka;
            this.model = model;
            this.fiyat = fiyat;
        }
    }

    public String getMarka() {
        return marka;
    }

    public int getModel() {
        return model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(int model) {

        this.model = model;
    }

    public void setFiyat(int fiyat) {
        if (model>0)
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model=" + model +
                ", fiyat=" + fiyat +
                '}';
    }
}
