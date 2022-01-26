package gun48.ornek1;

import gun48.ornek1.Insan;

public class Main {
    public static void main(String[] args) {
        Insan insan1=new Insan("ali");
        Insan insan2=new Insan("veli");
        Insan insan3=new Insan("hasan");
        Insan insan4=new Insan("hüseyin");
        Insan insan5=new Insan("yunus");

        insan1.arkadasAta(insan2);
        insan3.arkadasAta(insan4);
        insan4.arkadasAta(insan5);

        insan1.arkadasinKim();
        insan2.arkadasinKim();

        insan1.sohbetEt(insan2);

        insan1.sohbetEt(insan4);

    }
}
