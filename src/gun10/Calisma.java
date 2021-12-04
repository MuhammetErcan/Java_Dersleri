package gun10;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ders ve not girin");
        String dersVeNot = scanner.nextLine();
        int boslukIndex = dersVeNot.indexOf(" ");
        String not = dersVeNot.substring(boslukIndex+1);
        int notInt = Integer.parseInt(not);

        if (notInt>=90){
            System.out.println("A");
        }
        else if (notInt>=80){
            System.out.println("B");
        }
        else if (notInt>=70){
            System.out.println("C");
        }
        else if (notInt>=60){
            System.out.println("D");
        }
        else if (notInt>=50){
            System.out.println("E");
        }
        else if (notInt<50){
            System.out.println("F");
        }
    }
    }
