package gun48.ornek2;

public class Insan {
    String isim;
    boolean ehliyet;
    IsMakinesi arac;
    boolean aracHareketHalindeMi=false;
    boolean aractaMisin=false;
    boolean aracMiKullaniyorsun=false;


    public Insan(String isim, boolean ehliyet) {
        this.isim = isim;
        this.ehliyet = ehliyet;
    }

    public void aracaBin(IsMakinesi arac){
        if (this.arac==arac){
            System.out.println("zaten bu araçtayim");
        }
        else if (aractaMisin)
            System.out.println("zaten başka araçtayım  ");

        else if (arac.sofor!=null){
            System.out.println("aracın şöforü var ben binemem");
        }
        else if (aracHareketHalindeMi )
            System.out.println("araç hareket halinde binemem");

        else{
            System.out.println("araca biniyorum ");
            this.arac=arac;
            arac.sofor=this;
            aractaMisin=true;
        }

    }
    public void aractanIn(){
        if (!aractaMisin){
            System.out.println("zaten araçta değilim");
        }
        else if (aracHareketHalindeMi){
            System.out.println("araç hareket halinde inemem");
        }
        else{
            System.out.println("Tamam iniyorum");
            arac.sofor=null;

            aractaMisin=false;

        }
    }
    public void araciSur(){
        if (!ehliyet){
            System.out.println("ehliyetim yok kullanamam");
        }
        else if (aracHareketHalindeMi){
            System.out.println("araç zaten hareket halinde nasıl süreyim");
        }
        else if (!aractaMisin){
            System.out.println("araçta değilim ki nasıl süreyim");
        }
        else {
            System.out.println("sürmeye başlıyorum");
            aracHareketHalindeMi=true;
            aractaMisin=true;
            aracMiKullaniyorsun=true;
        }
    }
    public void dur(){
        if (aracMiKullaniyorsun && aracHareketHalindeMi){
            System.out.println("araci durduruyorum");
            aracHareketHalindeMi=false;
            aracMiKullaniyorsun=false;
        }
        else
            System.out.println("araç sürmüyoeum ki durdurayım");
    }
}
