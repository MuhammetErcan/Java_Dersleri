package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcı tarafından girilen yarıçaplı bir dairenin çevresini ve alanını kendi yönteminizi tanımlayarak yazdıran
        bir method yazın.
         */



        int alan = alan(4);
        int cevre = cevre(4);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


}
public static int alan (int sayi){
        int alanSonuc=(int)(sayi*sayi*3.14);
    return alanSonuc;
}
public static int cevre (int sayi){
        int cevreSonuc = (int) (2*3.14*sayi);
        return cevreSonuc;
}
}







