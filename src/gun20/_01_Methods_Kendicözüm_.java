package gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Methods_Kendicözüm_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin
        ve sayilari bir metot ile diziye atin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */

        String str = scanner.nextLine();
        array(str);
        enbArray(array(str));
        enkArray(array(str));


    }  public static int [] array(String str){
        String [] arrayStr = str.split(" ");
        int[] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayInt[i]=Integer.parseInt(arrayStr[i]);
        }
        return arrayInt;
    }
    public static void enbArray (int [] array){
        Arrays.sort(array);
        int enb = array[array.length-1];
        System.out.println("enb = " + enb);
    }
    public static void enkArray (int[] array){
        Arrays.sort(array);
        int enk = array[0];
        System.out.println("enk = " + enk);
    }

}

