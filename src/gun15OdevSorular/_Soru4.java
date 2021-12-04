package gun15OdevSorular;

import java.util.Scanner;

public class _Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Klavyeden girilen herhangi bir sayının faktöriyel değerini bulan bir program yazın.
        Bir sayının faktoriyeli, 1 den o sayıya kadar olan sayıların çarpımıdır.
         Input: 5 ise Output: 1*2*3*4*5 = 120 olur
         */
        System.out.println("sayi girin=");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();
        for (int i = 1; i <=sayi; i++) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);
    }
}
