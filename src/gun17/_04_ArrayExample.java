package gun17;

import java.util.Scanner;

public class _04_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle girmesini isteyin
        bu cümledeki kelime sayısını bulun
         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("cümle yazın");
        String str = scanner.nextLine();
        String[] cumle = new String[str.length()];
        int kelimeSayisi=1;
        for (int i = 0; i < cumle.length; i++) {
            cumle[i]=String.valueOf(str.charAt(i));

            if (str.charAt(i)==' '){
                kelimeSayisi++;
            }

        }
        for (String harf : cumle){
            System.out.print(harf+" ");
        }

        System.out.println("kelime sayısı = " +kelimeSayisi);



    }
}
