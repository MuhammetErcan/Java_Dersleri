package gun16;

import java.util.Scanner;

public class _03_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan bir sayi alaark bu sayi uzunluğnda in bir dizi oluşturun
        dizinin elemanlarıbnı kullanıcının gireceği sayilarla dolsurun
         */
        System.out.println("kaç elemanlı dizi olsun =");
        int num= scanner.nextInt();

        int [] nums = new int[num];

        for (int i = 0; i < nums.length; i++) {
            // diziyi doldurmak için olan döngü
            System.out.println("numarayı girin");
            nums[i]=scanner.nextInt();

        }
        for (int i = 0; i < nums.length; i++) {
            // diziyi yazdırmak için gerekli döngü
            System.out.print(nums[i]+ " ");

        }



    }
}
