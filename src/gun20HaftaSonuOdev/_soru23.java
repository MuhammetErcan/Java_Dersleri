package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
       Parametre olarak alacağı bir array'in maximum elemanını return edecek method yazın.
         */
        int [] array = {1,2,3,4,5,6,0,1,88,9,45};


        System.out.println(maks(array));

    }
    public static int maks (int [] array){

        Arrays.sort(array);

        int enb = array[array.length-1];
        return enb;
    }

}










