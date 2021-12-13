package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından girilen iki sayının çarpımını döndüren bir method tanımlayın.
         */
        int sayi1=scanner.nextInt();
        int sayi2 =scanner.nextInt();
        carpim(sayi1,sayi2);



}
public static void carpim (int a,int b){
        int carpim=a*b;
    System.out.println("carpim = " + carpim);
}
}







