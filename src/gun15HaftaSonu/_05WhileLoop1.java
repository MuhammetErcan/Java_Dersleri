package gun15HaftaSonu;

import java.util.Scanner;

public class _05WhileLoop1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------");
        i=0;
        while (i < 5){
            if (i==3)
                break;          // sart saglanirsa  loop biter
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------------");
        i=0;
        while (i < 5){
            if (i==3) {
                i++;
                continue;         // sart saglanirsa sonraki tura gececek
            }
            System.out.println(i);
            i++;
        }

    }
}

        /*
            break       ->  loop"i kirar, sonlandirir
            continue    ->  kendinden sonraki satirlari isletmeden bir sonraki tura gecer.
         */