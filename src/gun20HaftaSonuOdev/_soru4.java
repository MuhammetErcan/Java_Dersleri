package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Kullanıcıdan 10 tamsayı alın ve bunları bir dizide saklayın. Şimdi, tüm öğeleri başka bir diziye ters sırada
        kopyalayın.
         */
        int [] dizi =new int[10];
        int [] tersDizi =new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        for (int i = 0; i < tersDizi.length; i++) {
            tersDizi[i]=dizi[dizi.length-1-i];


        }
        System.out.println("tersDizi = " + Arrays.toString(tersDizi));


}

}

