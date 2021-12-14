package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Sayının asal olup olmadığını öğrenmek için bir method tanımlayın.
         */

        asalMi(13);

}
public static void asalMi(int sayi){
        Scanner scanner = new Scanner(System.in);
        int count =0;

    for (int i = 2; i < sayi; i++) {

        if (sayi % i == 0)
            count++;
    }
        if (count==0)
            System.out.println("sayi asaldır");
        else
            System.out.println("sayi asal değildir");

    }


}








