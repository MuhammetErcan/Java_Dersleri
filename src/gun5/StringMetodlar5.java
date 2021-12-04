package gun5;

public class StringMetodlar5 {
    public static void main(String[] args) {
        /*
            Verilen bir metini, verilen baska bir metinden önceki ve sonraki karakter uzunluklarini.

            text = "Java dünyasina hosgeldiniz";
            ayrac = "dünya"
            dünya"dan önce kac harf var, dünya"dan sonra kac harf vardir

            Java dünyasina hosgeldiniz
         */
        String text = "Java dünyasina hosgeldiniz";
        String ayrac = "dünya";

        /*
            Java dünyasina hosgeldiniz
            1234
         */

        // dünya'nin indexini bululam.

        // ayracin indexini bulduk
        int indexAyrac = text.indexOf(ayrac);  // dünya'nin nerede basladigi index

        // ayrac'a kakar olan texti buluyoruz
        String ilkBolum = text.substring(0, indexAyrac);
        System.out.println(ilkBolum + " , " + ilkBolum.length());

        //ayracdan sonraki inexi buluyoruz
        int indexAyrac2 = indexAyrac + ayrac.length();

        // ayractan sonraki texti buluyoruz
        String ikinciBolum = text.substring(indexAyrac2);
        System.out.println(ikinciBolum + ", " + ikinciBolum.length());

    }
}
