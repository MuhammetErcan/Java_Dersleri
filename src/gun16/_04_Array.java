package gun16;

import java.util.Scanner;

public class _04_Array {
    public static void main(String[] args) {

        /*
        kullanıcıdan 5 tane isim girmesini isteyin.
        bu isimlerden uzunluğu 6 dan büyük kaç eleman olduğunu bilin
         */

        Scanner scanner = new Scanner(System.in);
        String [] array = new String[5];

        int miktar = 0;
        for (int i = 0; i < array.length; i++) { // array.length -> 5 burda dizinin kaç elemanı olduğunu belirtir.
            System.out.println("isim girin= ");
            array[i]= scanner.nextLine();
            if (array[i].length()>6){  // array[i].length() -> dizinin o indisindeki elemanın uzunluğu
                miktar++;
            }
        }

        System.out.println("miktar = " + miktar);
    }
}
