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


        int[] array = new int[kacSayi];

        System.out.println("sayilari girin");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
         maxFark=array[array.length-1]-array[0];
        System.out.println("maxFark = " + maxFark);
        int minFark = maxFark;

        for (int i = 0; i < array.length; i++) {

            if (array[i+1]==array.length-1)
                break;
           else if (array[i+1]-array[i]<minFark)
                minFark=array[i+1]-array[i];

        }
        System.out.println("minFark = " + minFark);

    }
}







