package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        10 elemanlı bir dizi alın. Diziyi ortadan bölün ve öğeleri iki farklı dizide saklayın.
        Örneğin.- girilen dizisi: 58, 24, 13, 15, 63, 9, 8, 81, 1, 78,
        Böldükten sonra:
        58, 24, 13, 15, 63
        9, 8, 81, 1, 78
         */
        int [] array = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};
        int [] arrayIlkKisim=new int[array.length/2];
        int [] arrayIkinciKisim=new int[array.length/2];

        for (int i = 0; i < array.length/2; i++) {
            arrayIlkKisim[i]=array[i];
        }
        System.out.println(Arrays.toString(arrayIlkKisim));
        for (int i = 0; i < array.length/2; i++) {
            arrayIkinciKisim[i]=array[array.length-1-i];

        }
        System.out.println(Arrays.toString(arrayIkinciKisim));
    }
}