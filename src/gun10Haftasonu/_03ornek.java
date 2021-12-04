package gun10Haftasonu;

import java.util.Scanner;

public class _03ornek {
    public static void main(String[] args) {
        /*
        girilen 3 sayıdan en büyük ve en küçükk olanı ekrana yazdırın
         */
        Scanner scanner = new Scanner(System.in);

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 =scanner.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3
        && sayi2<sayi3){
            System.out.println("en büyük sayi= "+ sayi1 + "en küçük sayi= " + sayi2);
        }
        else if (sayi1>sayi2 && sayi1>sayi3 && sayi3<sayi2 ){
            System.out.println("en büyük sayi= "+ sayi1 + "en küçük sayi= " + sayi3);
        }
        else if ((sayi2>sayi1 && sayi2>sayi3 && sayi1<sayi3 )){
            System.out.println("en büyük sayi= "+ sayi2 + "en küçük sayi= " + sayi1);
        }
        else if (sayi2>sayi1 && sayi2>sayi3 && sayi3<sayi1 ){
            System.out.println("en büyük sayi= "+ sayi2 + "en küçük sayi= " + sayi3);
        }
        else if (sayi3>sayi1 && sayi3>sayi2 && sayi1<sayi2 ){
            System.out.println("en büyük sayi= "+ sayi3 + "en küçük sayi= " + sayi1);
        }
        else if (sayi3>sayi1 && sayi3>sayi2 && sayi2<sayi1 ){
            System.out.println("en büyük sayi= "+ sayi3 + "en küçük sayi= " + sayi2);
        }
    }
}
