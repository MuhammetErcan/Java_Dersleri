package gun13;

import java.util.Scanner;

public class _02_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan 0 girene kadar sayı girmesini isteyin
         */
        Scanner scanner = new Scanner(System.in);
        int num;
        /*
        while (num!=0){
        num= scanner.nextInt();
        }
        num değişkeninin başlangıç değeri olmadığı için whilw döngüsü içerisinde kontrol edemiyor ve
        hata var diyor  bu soru için do-whilw kullandık. do bloğu içerisinde num değişkenine kullanıcı tarafından
        sayi atandığı için while sorunsuz çalıştı.
         */

        do {
            System.out.println("sayi girin");
            num =scanner.nextInt();
        } while (num!=0);
    }
}
