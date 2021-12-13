package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından belirlenen öğelerin sayısı olan bir tamsayı dizisi düşünün. Öğeler ayrıca kullanıcıdan girdi
    olarak alınır. Tüm eleman çiftleri arasında maksimum ve minimum farka sahip olan eleman çiftini bulan bir
    program yazın.
         */
        System.out.println("kaç tam sayi girmek istiyorsunuz");
        int kacSayi = scanner.nextInt();
        int maxFark;
        int minFark = 0;

        int[] array = new int[kacSayi];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
         maxFark=array[array.length-1]-array[0];
        System.out.println("maxFark = " + maxFark);

    }
}







