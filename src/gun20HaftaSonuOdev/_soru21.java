package gun20HaftaSonuOdev;

import java.util.Scanner;

public class _soru21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan (100 üzerinden) puanlarını girmesini isteyen bir program yazınız. Girilen puanlara göre notları
        gösterecek bir method tanımlayın:
        Notlar Not
        90-100 AA
        85-89 BA
        80-84 BB
        75-79 CB
        70-74 CC
        50-69 DC
        50-59 DD
        <=40 Başarısız
         */
        notlar(55);


    }
        public static int notlar  (int sayi){

        if (sayi>=90)
            System.out.println("notunuz AA");
        else if (sayi>=85)
            System.out.println("notunuz BA");
        else if (sayi>=80)
            System.out.println("notunuz BB");
        else if (sayi>=75)
            System.out.println("notunuz CB");
        else if (sayi>=70)
            System.out.println("notunuz CC");
        else if (sayi>=50)
            System.out.println("notunuz DC");
        else if (sayi>=40)
            System.out.println("notunuz DD");
        else if (sayi<40)
            System.out.println("BAŞARISIZ");
        return sayi;

}

}








