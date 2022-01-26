package gun48.ornek2;

public class Main {
    public static void main(String[] args) {
        Insan insan1=new Insan("ali",true);
        IsMakinesi isMakinesi = new IsMakinesi("BMC");

        insan1.aracaBin(isMakinesi);
        insan1.araciSur();


    }
}
