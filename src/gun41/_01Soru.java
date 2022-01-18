package gun41;

import java.util.Scanner;

public class _01Soru {
    /*
    kullanıcıdan bir int alın hatasz girmesini sağlayalım.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean b =false;
        while (!b){

            try {
                System.out.println("bir sayi girin");
                int sayi = scanner.nextInt();
                b = true;
            }catch (Exception e){
                System.out.println("Integer girmelisiniz");
                scanner.nextLine();
            }
        }

        /*

import java.util.Scanner;

public class _01Soru {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        /*
        while (true){
            try {
                sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Sayi Girin");
                sc.nextLine();
            }
        }
         ----------------------------------------
            boolean devam = true;
            while (devam){
                try {
                    sc.nextInt();
                    devam = false;
                }catch (Exception e){
                    System.out.println("Sayi Girin");
                    sc.nextLine();
                }
            }
        }

    }
         */

    }
}
