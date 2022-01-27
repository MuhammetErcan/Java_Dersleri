package gun48.ornek2;

public class IsMakinesi {
    String isim;
    Insan sofor;
    boolean calisiyor;

    public IsMakinesi(String isim) {
        this.isim = isim;

    }

    public IsMakinesi(String isim, Insan sofor) {
        this.isim = isim;
        this.sofor = sofor;
    }

    public void soforunKim(){
        System.out.println(this.sofor.isim);
    }

}
