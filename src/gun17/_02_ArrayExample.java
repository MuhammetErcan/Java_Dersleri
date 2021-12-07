package gun17;

import java.util.Scanner;

public class _02_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        kullanıcıdan 5 tane e mail alin bu e maillerde @ işareti olmayanlarin miktarını bulun
         */
        String [] mailler = new String[5];
        int miktar=0;
        for (int i = 0; i < mailler.length; i++) {
            System.out.println("bir mail adresi girin");
            mailler[i] = scanner.nextLine();
        }
        /*for (int i = 0; i < mailler.length; i++) {
            if (!mailler[i].contains("@")){
                miktar++;
        }
            System.out.println("miktar = " + miktar);

         */
            for (String mail : mailler){    // foreach kalıbı
                if (!mail.contains("@")){
                    miktar++;
                }

            }
        System.out.println("miktar = " + miktar);
        }






    }

