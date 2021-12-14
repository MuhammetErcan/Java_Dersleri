package gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("mehmet" , "abdullah", "cihat"));
        // Listeye direkt veri eklemenin yolu           -->Arrays.asList() tir.
        System.out.println("isimler= " + isimler);

        // 2. yol
        ArrayList<String> dersler = new ArrayList<>(){
            {

                add("matematik");
                add("türkçe");
                add("fizik");
            }
        };

        isimler.addAll(dersler);   // dersler listesini isimler listesine ekler   --> addAll
        System.out.println("isimler = " + isimler);

        isimler.removeAll(dersler);  // dersler listesini isimler listesinden siler    -->removeAll
        System.out.println("isimler = " + isimler);


        if (isimler.contains("mehmet"))  // contains() metodu listenin tamamını kontrol edebilir   -->contains
            System.out.println("mehmet liste içinde var");




    }
}
