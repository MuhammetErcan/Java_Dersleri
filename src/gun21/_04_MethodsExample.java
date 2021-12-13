package gun21;

import java.util.Scanner;

public class _04_MethodsExample {
    public static void main(String[] args) {
       /*
         Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.

        */
        /*
        password();


    }
   /* public static void password (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("parolayı girin");
        String parola= scanner.nextLine();

        if (parola.length()>=8 && parola.length()<=12 && !parola.contains("pass")) {
            System.out.println("parola geçerli");
        }
        else
            System.out.println("parola geçersiz");

    */
        System.out.println(isCorrect("rggerg12rwe"));
        System.out.println(isCorrect("pass34"));

    }
    public static boolean isCorrect(String password){

        return password.length()>8 && password.length()<12
                && !(password.contains("pass"));
    }

}


