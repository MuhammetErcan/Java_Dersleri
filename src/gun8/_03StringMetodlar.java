package gun8;

import java.util.Locale;

public class _03StringMetodlar {
    public static void main(String[] args) {

        // trim
        // baştaki ve sondaki boşlukları siler

        String str = " Java Dersleri ";
        String strTrim = str.trim();
        System.out.println(strTrim);
        System.out.println(str.length());
        System.out.println(strTrim.length());

        // toLowerCase
        // string ifade içindeki tüm büyük harfleri küçük harfe çevirir
        String strToLowerCase = str.toLowerCase();
        System.out.println(strToLowerCase);

        // toUpperCase
        // string ifadedeki tüm küççük harfleri büyük harfe çevirir.

        String strToUpperCase = str.toUpperCase();
        System.out.println(strToUpperCase);

        // equals
        // girilen iki stringin eşit olup olmadığına bakar((büyük küçük hrf duyarlı )

        String strEquals = "java";
        System.out.println(str.equals(strEquals));

        // equalsIgnoreCase
       // girilen iki Stringin eşit olup olmadığına bakar büyük küçük hrf duyarlı değil

        System.out.println(str.equalsIgnoreCase(strEquals));

        // contains
        //Stringin içinde verilen string ifadenin olup lmadığını kontrol eder
        // büyük küçük harf, boşluk olup olmaması kısaca herşeyin kontrolünü yapar.

        System.out.println(str.contains("J ava"));




    }
}
