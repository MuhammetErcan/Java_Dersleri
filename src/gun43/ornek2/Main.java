package gun43.ornek2;

public class Main {
   /*
         Sekil
                (cevre, alan = throws new RuntimeError)
            Cember(cevre = 2*Math.PI*Yaricap)
                fields : yaricap
                Daire (cevre = 2*Math.PI*Yaricap, alan = Math.PI*yaricap*yaricap)
            Dikdortgen (cevre = 2*(uzunluk+genislik), alan = uzunluk*genislik)
                fields : uzunluk ve genislik
                Kare (cevre = 4*uzunluk, alan = uzunluk*uzunluk)
                (fields : uzunluk, Parent§dan kullanabilir)
          Cember extends Sekil
            Daire extends Cember
         Dikdortgen extends Sekil
         Kare extends Dikdortgen
         constructor"lari, alan ve cevre hesaplama metdlari, olmayanlar icin hara throw edilecek
         toString methodlari
         hangi class"in nasil bir degiskene ihtiyaci var, belirleyin
     */
   public static void main(String[] args) {
       Sekil sekil=new Sekil();
       //System.out.println(sekil.alan());
       //System.out.println(sekil.cevre());

       Cember cember=new Cember(2.5);
       System.out.println(cember.cevre());
       //System.out.println(cember.alan());

       Dikdortgen dikdortgen=new Dikdortgen(3,5);
       System.out.println(dikdortgen.alan());
       System.out.println(dikdortgen.cevre());

       Kare kare=new Kare(3);
       System.out.println(kare.alan());
       System.out.println(kare.cevre());

       Daire daire=new Daire(3);
       System.out.println("--------");
       System.out.println(daire.cevre());








   }
}
