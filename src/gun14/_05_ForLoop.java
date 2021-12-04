package gun14;

import java.util.Locale;
import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan içinde a ve c de oacak şekilde bir kelime girmesini isteyin
        kelime içerisindeki a harflerinin sayisini bulun.
        c harfi görünce program sonlansın
         */
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.nextLine();
        int aSayisi =0;
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.toLowerCase(Locale.ROOT).charAt(i)=='a'){
                aSayisi++;
            }
            else if (kelime.toLowerCase(Locale.ROOT).charAt(i)=='c'){
                break;
            }

        }
        System.out.println("aSayisi = " + aSayisi);
    }

}
