package gun19;

public class _04_Methods {
    public static void main(String[] args) {
        /*
        6 elemanlı bir sayı dizisi oluşturun ve bu dizideki tek ve çift eleman sayısıı bulan bir metod yazın.
         */

        int[] sayilar = {1,2,3,4,5,6};

        istenen (sayilar);
    }

    public static void istenen(int []a) {
       int tekMiktar=0;
       int ciftMiktar=0;
        for (int i = 0; i < a.length; i++) {

        if (a[i]%2==0){
            ciftMiktar++;
        }
        else
        {
            tekMiktar++;
        }
        }
        System.out.println("tek sayılar= " +tekMiktar + "adet");
        System.out.println("çift sayılar= " +ciftMiktar + "adet");
    }
}
