package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Kullanıcıdan 20 tamsayı girişi alın ve aşağıdakileri yazdırın:
        pozitif sayıların sayısı
        negatif sayıların sayısı
        tek sayıların sayısı
        çift sayıların sayısı
        0 (sıfır) sayısı.
         */


        int [] sayilar = new int[20];
        int pozitifMiktar=0;
        int negatifMiktar=0;
        int tekMiktar=0;
        int ciftMiktar=0;
        int sifirMiktar=0;

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]= scanner.nextInt();
            if (sayilar[i]>0)pozitifMiktar++;
            if (sayilar[i]<0)negatifMiktar++;
            if (sayilar[i]%2==0)ciftMiktar++;
            if (sayilar[i]%2==1)tekMiktar++;
            if (sayilar[i]==0)sifirMiktar++;
        }
        System.out.println("pozitifMiktar = " + pozitifMiktar);
        System.out.println("negatifMiktar = " + negatifMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);
        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("sifirMiktar = " + sifirMiktar);



}

}

