package gun22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _05_ArrayList {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle girmesini isteyin bu cümleyi tersten yazdırın.

         */
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();

        String [] kelimeler = cumle.split("");
        reserveArray(kelimeler);


            }
            public static void reserveArray (String[]array){

        ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < array.length; i++) {
                    list.add(array[i]);

                }
                Collections.reverse(list);

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));

                }
            }

        }
