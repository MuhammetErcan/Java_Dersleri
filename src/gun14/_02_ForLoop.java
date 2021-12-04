package gun14;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {
        /*
        başlangıç ve bitiş değerini kullanıcıdan alarak bu aralıktaki sayıların
        toplamını ekrana yazdırın (sayılar dahil)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("başlangıç değeri girin");
        int baslangic = scanner.nextInt();

        System.out.println("bitiş değeri girin");
        int bitis = scanner.nextInt();
        int toplam=0;
        if (baslangic<bitis){
            for (int i= baslangic; i<=bitis;i++){
                toplam+=i;
        }
        }
        else{
            for (int i =baslangic; i>=bitis; i--){
                toplam+=i;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
