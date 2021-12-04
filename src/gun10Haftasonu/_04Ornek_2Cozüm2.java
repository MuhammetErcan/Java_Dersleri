package gun10Haftasonu;

import java.util.Scanner;

public class _04Ornek_2Cozüm2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int saat;
        String indirimKarti;


        System.out.print("Park süresi (saat) : ");
        saat = sc.nextInt();
        sc.nextLine();
        System.out.print("Indirim karti var mi? ('Y', 'N') : ");
        indirimKarti = sc.nextLine();

        double fiyat = 0;  // altta veri atanacagi icin ilk deger atamazabiliriz
        if (saat <= 2){
            fiyat = 5;
        }else if (saat <=5){
            fiyat = 10;
        }else {
            fiyat = 15;
        }

        // indirim uygulaniyor
        if (indirimKarti.equalsIgnoreCase("Y"))
            fiyat = fiyat * 0.8;

        System.out.println("Borcunuz : " + fiyat);
    }
    }

