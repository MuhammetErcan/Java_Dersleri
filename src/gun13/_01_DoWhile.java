package gun13;

import java.util.Scanner;

public class _01_DoWhile {
    public static void main(String[] args) {
        /*
        kullanıcıdan x girene kadar kelime girmesini isteyin
         */
        /*
        while döngüüsnde önce şartı kontrol eder eğer şart sağlanıyorsa döngü içerisine girer.
        do-while döngüsünde tek fark önce işlemi yapar sonra while içerisindeki şartın sağlanıp sağlanmadığına bakar
         */
        Scanner scanner = new Scanner(System.in);
        String kelime ;
        do {
            System.out.println("Kelime girin");
            kelime=scanner.nextLine();
        } while (!kelime.contains("x"));
        // kelime içerisinde x olmadığı sürece devam eder.
    }
    {
        // scope {} iki süslü parantez içine yazılanlar sadece bu kısımda kullanılabilir
    }



}

