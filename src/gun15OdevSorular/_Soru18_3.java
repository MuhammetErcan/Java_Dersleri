package gun15OdevSorular;

public class _Soru18_3 {
    public static void main(String[] args) {
        /*l
                *
               **
              ***
             ****
            *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
