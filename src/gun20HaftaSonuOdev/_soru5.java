package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir dizinin tüm elemanlarının toplamını ve çarpımını bulan bir program yazın.
         */

        int [] array = new int[5];
        int toplam=0;
        int carpim=1;
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
            toplam+=array[i];
            carpim*=array[i];

        }
        System.out.println("toplam = " + toplam);
        System.out.println("carpim = " + carpim);


}

}

