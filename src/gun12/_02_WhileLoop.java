package gun12;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan pozitif bir tamsayı isteyin.
        0 ile bu sayı arasındaki tek sayıları ekrana yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı girin= ");
        int num = scanner.nextInt();

        while (num>0) {
            if (num%2==1){
                System.out.print(num +" ");
            }
                num--; // num = num-1   || num-=1

        }
    }
}
