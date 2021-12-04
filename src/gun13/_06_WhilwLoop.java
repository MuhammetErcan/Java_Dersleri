package gun13;

import java.util.Scanner;

public class _06_WhilwLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane kelime girmesini isteyin.
        Bu kelimeler  icerisinde a olan kac tane kelime oldugunu yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        int count = 0; // içinde a geçen kelime sayısı
        int ayrac = 0;

        while (ayrac<5) {
            System.out.println("kelime girin=");
            String name = scanner.nextLine();

            if (name.contains("a")){
                count= count+1;
            }
            ayrac++;

        }
        System.out.println("içinde a harfi geçen kelime sayısı= " + count);


    }
}
