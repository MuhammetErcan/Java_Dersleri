package gun9;

import java.util.Scanner;

public class _03IfElseVeVeya {
    public static void main(String[] args) {
        /*
        öğrenci sınavdan 50 den az alırsa sınıfta kalır
        50 ve 80 arası iyi not alır
        80 ve 100 arası pekiyi not alır
        && --> ve demek
        ||--> veya
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu girin");

        int not =scanner.nextInt();
        if (not<50){
            System.out.println("büte kalsin");
        } else if (not>=50 && not<80){ // yazilan iki sartin da saglanmasi gerekli
            System.out.println("Iyi");
        } else if (not>=80 && not<100){
            System.out.println("pekiyi");
        }
        else {
            System.out.println("100 aldin");
        }

        if (not<50){
            System.out.println("büte kalsin");
        } else if (not>=50 || not<80){ // bir sart saglanirsa kosul gecerli olur
            System.out.println("Iyi");
        } else if (not>=80 || not<100){
            System.out.println("pekiyi");
        }




    }
}
