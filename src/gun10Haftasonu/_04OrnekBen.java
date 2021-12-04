package gun10Haftasonu;

import java.util.Scanner;

public class _04OrnekBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Bir otpark ücret hesapalama programı yapılma isteniyor. 0-2 saat ara 5€, 2-5 arası 10€ ,
        5 saatten sonra 15€ olarak saat girildiğinde ücreti yazdırınız.
        Indirim karti varsa %20 indirim yapin
         */
        System.out.println("indirim kartınızın olup olmadığını ('var' veya 'yok') ve kaç saat kaldığınızı yazın = ");

        String kartVeSaat = scanner.nextLine();
        int boslukIndex = kartVeSaat.indexOf(" ");
        String ilkKisim = kartVeSaat.substring(0,boslukIndex);
        String saat = kartVeSaat.substring(boslukIndex+1);
        int saatInt =Integer.parseInt(saat);

        if (saatInt>0 && saatInt<2 && ilkKisim.equalsIgnoreCase("var"))
            System.out.println(5*4/5);
        if (saatInt>0 && saatInt<2 && ilkKisim.equalsIgnoreCase("yok"))
            System.out.println(5);
        if (saatInt>2 && saatInt <=5 && ilkKisim.equalsIgnoreCase("var" ))
        System.out.println(10*4/5);
        if (saatInt>2 && saatInt <=5 && ilkKisim.equalsIgnoreCase("yok" ))
        System.out.println(10);
        if (saatInt>5 && ilkKisim.equalsIgnoreCase("var" ))
        System.out.println(15*4/5);
        if (saatInt>5 && ilkKisim.equalsIgnoreCase("yok" ))
        System.out.println(15);









    }
}
