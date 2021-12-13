package gun21;

public class _03_MethodsExample {
    public static void main(String[] args) {
        /*
         Bir ögrencinin isminin girildiği ve  notlarinin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */

        ortalamaBul("mehmet",66,77,88,99,100);
        ortalamaBul("abdullah",77,88,99,100);

    }
    public static void ortalamaBul(String name,int...notlar ){


        int toplamNot=0;
        for (int i = 0; i < notlar.length; i++) {
            toplamNot+=notlar[i];
        }
        int ortalama = toplamNot/notlar.length;

        System.out.println("öğrenci " + name + "sinavlardan ortalama " + ortalama + "sonucunu almıştır.");

    }
}
