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
            Cember c = new Cember(3);
            Daire d = new Daire(4);

            System.out.printf("Cemberin cevresi %.2f birimdir.\n", c.cevreHesapla());
            //System.out.println(c.alanHesapla());
            System.out.printf("Dairenin cevresi %.2f birimdir.\n",d.cevreHesapla());
            System.out.printf("Dairenin alani %.2f birim karedir.\n",d.alanHesapla());

            System.out.println("---------------------------");

            Dikdortgen d1 = new Dikdortgen(3, 5);
            Kare k1 = new Kare(4);

            System.out.printf("Dikdörtgenin cevresi %.2f birimdir.\n", d1.cevreHesapla());
            System.out.printf("Dikdörtgenin alani %.2f birimdir.\n", d1.alanHesapla());

            System.out.printf("Karenin cevresi %.2f birimdir.\n", k1.cevreHesapla());
            System.out.printf("Karenin alani %.2f birimdir.\n", k1.alanHesapla());
            System.out.println(d1);
            System.out.println(k1.toString());

        }
    }
