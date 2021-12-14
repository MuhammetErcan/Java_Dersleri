package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir sayının faktöriyelini 'Faktöriyel' adında bir yöntem tanımlayarak yazdıran bir program yazın.
        Herhangi bir n sayısının faktöriyeli n ile temsil edilir! ve 1*2*3*....*(n-1)*n'ye eşittir. Örneğin.-
        4! = 1*2*3*4 = 24, 3! = 3*2*1 = 6, 2! = 2*1 = 2, Ayrıca, 1! = 1 ve 0! = 0
         */
        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt();
        int cevapFaktoriyel = faktoriyel(sayi);
        System.out.println("cevapFaktoriyel = " + cevapFaktoriyel);


    }
    public static int faktoriyel(int sayi){
        int faktoriyel =1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;

        }
        if (sayi==1) faktoriyel=1;
        else if (sayi==0) faktoriyel=0;

        return faktoriyel;
    }

}










