package gun15HaftaSonu;

import java.util.Scanner;

public class _09Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*girilen bir kelimenin polidrom olup olmadığını ekrana yazdırın.
        // tersten okunduğunda aynı olan kelimeler polidromdur
        //aba adanada
        adanadc  aba 121 101  polidrom
          index  0 1 2 3 4 5 6
                 a d a n a d a
                 i   str.length()-1
                 0 = 6  6-i
                 1 = 5  6-i
                 2 = 4  6-i
                 3 = 3  6-i
                                   str.length()-1 = 6
                 str.acharAt(i) == str.charAt(6-i)
           i=0   str.acharAt(0) == str.charAt(6-0)
           i=1   str.acharAt(1) == str.charAt(6-1)
           i=2   str.acharAt(2) == str.charAt(6-2)
           i=3   str.acharAt(3) == str.charAt(6-3)
           ...   ...........

         */

        System.out.println("bilr kelime girin");
        String kelime = scanner.nextLine();

        int len = kelime.length();
        boolean pol = true;

        for (int i = 0; i < len/2; i++) {
            if (kelime.charAt(i) != kelime.charAt(len-1-i)) {
                pol = false;
                break;
            }
        }
        if (pol)
            System.out.println(kelime + " polidromdur");
        else
            System.out.println(kelime + " polidrom degildir");



        }

    }

