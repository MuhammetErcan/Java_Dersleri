package gun48.ornek2;

public class Main {
    public static void main(String[] args) {
        Insan insan1=new Insan("ali",true);
        Insan insan2=new Insan("veli",true);
        Insan insan3=new Insan("hasan",false);
        Insan insan4=new Insan("hüseyin",false);
        IsMakinesi isMakinesi1 = new IsMakinesi("BMC");
        IsMakinesi isMakinesi2 = new IsMakinesi("DOC",insan2);
        IsMakinesi isMakinesi3 = new IsMakinesi("MERCEDES");

        insan1.aracaBin(isMakinesi1);
        insan1.dur();
        insan2.araciSur();
        insan3.araciSur();
        insan1.aracaBin(isMakinesi2);
        insan1.aractanIn();
        insan1.aracaBin(isMakinesi2);
        insan1.aracaBin(isMakinesi3);
        insan1.dur();
        insan1.araciSur();
        insan1.aractanIn();
        insan1.araciSur();
        insan1.aracaBin(isMakinesi1);
        insan1.dur();
        insan1.aractanIn();
        insan1.aractanIn();
        insan3.aracaBin(isMakinesi1);
        insan3.araciSur();
        insan3.dur();
        insan3.aracaBin(isMakinesi1);

        isMakinesi1.soforunKim();



    }
}
