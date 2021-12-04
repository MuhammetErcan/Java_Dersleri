package gun14;

import java.util.Scanner;

public class _02_Continue {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 pozitif tam sayı girmesini isteyin.
        bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulun.
        bu soruda continue kullanın
         */
        Scanner scanner = new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("bir tam sayi girin");
            int sayi= scanner.nextInt();
            if (sayi>5 && sayi<10){
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam"+ toplam);
    }
}
