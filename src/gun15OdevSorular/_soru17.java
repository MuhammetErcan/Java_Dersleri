package gun15OdevSorular;

import java.util.Scanner;

public class _soru17 {
    /*
    Rastgele bir sayı üreten ve kullanıcıdan sayının ne olduğunu tahmin etmesini isteyen bir
    program yazın. Kullanıcının tahmini rastgele sayıdan daha yüksekse, program "Çok yüksek, tekrar
    deneyin" mesajını göstermelidir. Kullanıcının tahmini rasgele sayıdan daha düşükse, program "Çok
    düşük, tekrar deneyin" mesajını göstermelidir. Program, kullanıcı rastgele sayıyı doğru tahmin edene
    ya da 5 hakkını tamamlayana kadar tekrar eden bir döngü kullanmalıdır.
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int randomSayi = (int) (Math.random()*3);
        System.out.println("bir sayi girin=");
        int i;

        for ( i = 0; i < 5; i++) {

            int sayi = scanner.nextInt();

            if (i==4){
                 System.out.println("hakkınız biitti");
                System.out.println(" random sayi = " + randomSayi);
                break;
            }

            if (sayi > randomSayi) {
                System.out.println(" sayi yüksek tekrar deneyin");
            }
            if (sayi < randomSayi) {
                System.out.println("sayi düşük tekrar deneyin");

            }
            if (sayi == randomSayi) {
                System.out.println("tebrikler");
                break;
            }
            }
        }
    }




