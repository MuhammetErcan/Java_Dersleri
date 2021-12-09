package gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _02_ArrayMetodlari {
    public static void main(String[] args) {
        /*  --> Arrays.toString
        5 elemanlı bir int dizi oluşturun ve ekrana yazdırın
         */
        int [] nums = {23,34,45,56,67};

        // 1. yöntem
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
        System.out.println();
        // 2.yöntem
        System.out.println(Arrays.toString(nums));
        // diziyi ekrana yazdırmanın ikinci yolu

    }
}
