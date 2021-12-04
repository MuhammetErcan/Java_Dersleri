package gun11;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        /*
        kullanıcıdan aralarında vrgül olacak şekilde 2 tam sayu alınnu sayılardqn büyük olani ekrana yazdırın
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println(" aralarında virgül olacak şekilde iki tam sayi girin");

        String istenen= scanner.nextLine();
        int virgulIndex= istenen.indexOf(",");
        String ilkSayi =istenen.substring(0,virgulIndex);
        String ikinciSayi= istenen.substring(virgulIndex+1);
        int ilkSayiInt = Integer.parseInt(ilkSayi);
        int ikinciSayiInt= Integer.parseInt(ikinciSayi);

        int max= Math.max(ilkSayiInt,ikinciSayiInt);
        System.out.println("max = " + max);


    }
}
