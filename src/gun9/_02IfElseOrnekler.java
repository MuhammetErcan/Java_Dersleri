package gun9;

import java.util.Scanner;

public class _02IfElseOrnekler {
    public static void main(String[] args) {
        /*
        ekrandan bir sayı girin. eğer sayi sıfırdan büyükse ekrana pozitif yazın sayı sıfırdan küçükse negatif yazın
        pozitif yada negatif değilse ekrana sıfır yazdırın.

         */
        Scanner scanner = new Scanner(System.in);

        int sayi1= scanner.nextInt();

        if (sayi1>0) {
            System.out.println("pozitif");
        }

        else if (sayi1<0) {
            System.out.println("negatif");
        }
        else{
            System.out.println("0");
        }


    }
}
