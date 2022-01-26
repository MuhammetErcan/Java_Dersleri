package gun48.ornek1;

import java.util.ArrayList;

public class Insan {
    String ismi;
    ArrayList<Insan> arkadaslar;
    boolean sohbetEdiyorMu = false;

    @Override
    public String toString() {
        return "Insan{" +
                "ismi='" + ismi + '\'' +
                ", arkadaslar=" + arkadaslar.size() +
                '}';
    }





    public Insan(String ismi) {
        arkadaslar = new ArrayList<>();
        this.ismi = ismi;
    }

    public void arkadasAta(Insan insan) {
        this.arkadaslar.add(insan);
        insan.arkadaslar.add(this);
    }

    public void arkadasinKim(){
        System.out.println(arkadaslar);
    }



    public void sohbetEt(Insan insan) {
        if (sohbetEdiyorMu)
            System.out.println("şu an başkasıyla sohbet ediyorum");
        else if (arkadaslar.contains(insan)) {
            System.out.println("sohbete  başladık");
            sohbetEdiyorMu = true;
        } else
            System.out.println("arkadaşım değil sohbet edemem");
    }
}


