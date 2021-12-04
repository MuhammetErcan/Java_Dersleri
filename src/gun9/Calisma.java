package gun9;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("notunuzu girin");

        int not = scanner.nextInt();

        if (not<50){
            System.out.println("büte kaldnıız");
        }
        else if (not>=50 && not<80 ){
            System.out.println("iyi not aldın");
        }
        else if (not>=80 && not <=100){
            System.out.println("pekiyi aldın");
        }
    }
}
