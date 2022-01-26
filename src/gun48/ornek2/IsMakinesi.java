package gun48.ornek2;

public class IsMakinesi {
    String isim;
    Insan sofor;
    boolean calisiyor;

    public IsMakinesi(String isim) {
        this.isim = isim;

    }

    public void getSofor(){
        System.out.println(this.sofor.isim);
    }

}
