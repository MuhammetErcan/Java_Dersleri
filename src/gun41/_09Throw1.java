package gun41;

import java.util.Scanner;

public class _09Throw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5 ile 10 arasında sayi girin");
        int sayi1= sc.nextInt();
        if ( sayi1<5){
            System.out.println("sayi 5 ten küçük olmamalı");
        }else if (sayi1>10)
            System.out.println("sayi 10 dan büyük olmamalı");

    }
}
