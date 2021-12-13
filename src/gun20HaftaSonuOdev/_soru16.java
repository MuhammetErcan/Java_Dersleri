package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir kişi, yaşı 18'den büyük veya ona eşitse oy kullanmaya uygundur. Oy kullanmaya uygun olup olmadığını
        öğrenmek için bir method tanımlayın.
         */
        System.out.println("yaşınızı girin");
        int yas = scanner.nextInt();
        cevap(yas);

}
public static void cevap (int sayi){
        if (sayi>18)
            System.out.println("oy kullanabilirsiniz");
        else
            System.out.println("oy kullanamazsınız");
}
}







