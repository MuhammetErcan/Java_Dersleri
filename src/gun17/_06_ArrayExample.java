package gun17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _06_ArrayExample {
    public static void main(String[] args) {
        /*
        kullanıcıdan 5 tane sayi alın ve en büyük sayiyi ekrana yazdırın;
         */
        Scanner scanner = new Scanner(System.in);
        int[]nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("sayi girin");
            nums[i]= scanner.nextInt();

        }
        Arrays.sort(nums);    // bunun yerine for döngüsü ve if şartı ile en büyük sayıyı bulutorduk
        //sort () metodu bunu tek satırda bizim yerimize yaptı. Diziyi küçükten büyüğe sıraladı.
        int enb = nums [nums.length-1];   // dizinin indis değerleri 0 dan başlar
        // uzunluk saymaya ise 1 den başlar bu nedenle dizinin son elemanı nums[4] tür
        // dizinin lenght i ise 5 olduğu için nums.lenght-1 yaptık
        System.out.println("enb = " + enb);
    }
}
