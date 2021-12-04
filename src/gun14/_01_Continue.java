package gun14;

import java.util.Scanner;

public class _01_Continue {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cümle girmesini isteyin. cümledeki her harfi alt alta yazdırın
        boşluk gelirse bosluğu yazdırmayın.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle = scanner.nextLine();
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' '){
                continue; // alt satıra indirmez döngüde yukarı doğru devam eder
            }
            System.out.println(cumle.charAt(i));

        }
    }
}
