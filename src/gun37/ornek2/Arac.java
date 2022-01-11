package gun37.ornek2;

public class Arac {
    /*
    private 4 değişken tanımlayın
    marka(enum), model, tipi(enum) fiyat,

    2-3 adet constructor yazın
    getter ve setter larını olulturun
    toString methodunu oluşturun.
    main metodu içinde bir nesne oluşturup
    uygun setterları uygun şekilde düzenleyin
     */

    private Marka marka;
    private int model;
    private Tip tip;
    private int fiyat;

    public Arac(Marka marka, int model) {
        this.marka = marka;
        this.model = model;
    }

    public Arac(Marka marka, int model, Tip tip) {
        this(marka,model);
        this.tip = tip;
    }

    public Arac(Marka marka, int model, Tip tip, int fiyat) {
        this(marka,model,tip);
        this.fiyat = fiyat;
    }

    public Marka getMarka() {
        return marka;
    }

    public int getModel() {
        return model;
    }

    public Tip getTip() {
        return tip;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public void setModel(int model) {
        if (model>2000)
        this.model = model;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public void setFiyat(int fiyat) {
        if (fiyat>0)
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka=" + marka +
                ", model=" + model +
                ", tip=" + tip +
                ", fiyat=" + fiyat +
                '}';
    }
}
