package gun41;

import java.io.IOException;
import java.util.Scanner;

public class _011Throw3 {
    /*
    girilen sayi çift ise,
     3 ile bölünebiliyorsa iki farklı hata throw edip yakayın
     hata yok ise karesini ve karekökünü
     hatasız girinceye kadar döngü devam etsin
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("bir sayi girin ");
                int sayi = scanner.nextInt();
                if (sayi % 2 == 0) {
                    throw new ArithmeticException("çift oolma hatası");
                }
                if (sayi%3==0){
                    throw new IOException("3 e bölünme hatası");
                }
                else
                    System.out.println("girdiğiniz sayinin karesi = "+ sayi*sayi);
                    System.out.println("girdiğiniz sayının karekökü= " + Math.sqrt(sayi));
                break;
            }catch (ArithmeticException e){
                System.out.println("sayi çift olmamalı");
            }catch (IOException e){
                System.out.println("sayi 3 e bölünmemeli");
            }
        }

    }
}
