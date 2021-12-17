package gun24;

import java.util.HashSet;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        sayi veya true false gibi basit isimler için değişken tanımlarken bunları int, double , boolean gibi
        basit(primitiv) tiplerini kullandık
        eğerki bu işlemlerden daha fazlasına ihtiyaç duyacaksak bu veri tiplerinin class halini yani baş harfleri
        büyük olacak şekilde kullanırız.
        bunlara wrapper class denir.
         */

        int num = 5;  // num değişkeni basit veri tutar
        Integer buyukVeri=6;  // büyükverinin kendine ait metotları vardır
        buyukVeri.toString();


        num =buyukVeri;  //
        buyukVeri=num;

        // ArrayList<int>nums = new ArrayList<int>(); yanlış bir kullanım
        // burada tutacağım sayılarla basit toplama çıkarma gibi işlemlerin
        // dışında işlem yaptığım için Integer olarak tanımlamam gerekir.


        double d=12.3;
        Double buyukD=34.2;

        boolean b = true;
        Boolean buyukB = false;

        float f = 2.34F;
        Float buyukF = 3.12f;

    }

}
