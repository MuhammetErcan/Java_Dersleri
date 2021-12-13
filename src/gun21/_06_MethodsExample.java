package gun21;

import java.util.Arrays;
import java.util.Scanner;

public class _06_MethodsExample {
    public static void main(String[] args) {
       /*
         aaabbbfffgggtttdddd bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
         ciktisi bu sekilde olacaktir -> 3a3b3f3g3t4d
        */
        String str = "aaabbbfffgggtttdddd";
        String [] harfler = str.split("");
        System.out.println(Arrays.toString(harfler));

        for (int i = 0; i < harfler.length; i++) {
            for (int j = 0; j < harfler[i].length(); j++) {


            }

        }



    }
}


