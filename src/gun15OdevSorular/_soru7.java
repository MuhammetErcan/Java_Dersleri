package gun15OdevSorular;

import java.util.Scanner;

public class _soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        0 (sıfır) girilene kadar okutulacak tamsayılardan tek ve çift olanların sayısı ile teklerin ve
        çiftlerin ayrı ayrı toplamlarını yazan programı yazın.
         */
        int sayi;
        int toplamCift = 0;
        int toplamTek =0;
        int countCift=0;
        int countTek =0;
        do {
            System.out.println("tam sayi giriniz");
            sayi = scanner.nextInt();
            if (sayi%2==0){
                countCift++;
                toplamCift+=sayi;
            }

            if (sayi%2==1){
                countTek++;
                toplamTek+=sayi;
            }

        } while (sayi!=0);
        System.out.println("çift sayılar adeti=" + countCift);
        System.out.println("tek sayılar adeti = " + countTek);
        System.out.println("çitf sayılar toplamı= " +toplamCift);
        System.out.println("tek sayılar toplamı= " +toplamTek);
    }
}
