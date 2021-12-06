package gun16;

import java.util.Scanner;

public class _05_Array {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
        Kullanıcıdan 5 tane pozitif tam sayi girmesini isteyin.
        bu sayilari bir diziye atın. bu sayıların en büyüğünü ekrana yazdıın
         */
        System.out.println("5 sayı girin");
       int enb = 0;
        int[]nums= new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= scanner.nextInt();
            if (nums[i]>enb){
                enb=nums[i];
            }
        }
        System.out.println("en büyük" + enb);


    }
}
