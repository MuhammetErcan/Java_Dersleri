package gun15OdevSorular;

import java.util.Scanner;

public class _soru8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın. Ardından, sayının asal
    sayı olup olmadığını belirten bir mesaj çıkarmalıdır.
    Asal sayı, yalnızca 1 ve kendisine bölünebilen pozitif sayılardır.
    Input: -2 Output: false Input: 5 Output: true
    Input: 2 Output: true Input: 10 Output: false
         */
        System.out.println("bir tam satı girin");
        int sayi = scanner.nextInt();
        int count=0;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                count++;
                 }
             }
            if (count==0){
                System.out.println(sayi+ " asal bir sayıdır");
            }
            else {
                System.out.println(sayi + "asal sayi değildir.");
            }
        }
    }

