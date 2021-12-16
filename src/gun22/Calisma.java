package gun22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle girmesini isteyin bu cümleyi tersten yazdırın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle girin");
        String str = scanner.nextLine();
        String [] kelimeler = str.split(" ");
        System.out.println(list(kelimeler));


    }
    public static ArrayList<String> list(String[] array){
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        Collections.reverse(list);
        return list;
    }
}
