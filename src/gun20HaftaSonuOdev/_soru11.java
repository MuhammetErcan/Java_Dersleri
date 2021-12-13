package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir dizinin her elemanını dairesel olarak sağa kaydıran bir program yazın. Örneğin.-
        GİRİŞ : 1 2 3 4 5
        ÇIKTI : 5 1 2 3 4
         */
        int[] dizi = {1, 2, 3, 4, 5,6,7,8};
        int[] dizi2 = new int[dizi.length];

        dizi2[0] = dizi[dizi.length - 1];
        for (int i = 1; i < dizi.length; i++) {

            dizi2[i] = dizi[i-1];

        }
        System.out.println(Arrays.toString(dizi2));
    }
}







