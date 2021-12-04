package gun15;

public class _03_NestedLoop {
    public static void main(String[] args) {
        /*
        *
        * *
        * **
        * ***
        * ****
         */
        for (int satir = 0; satir < 5; satir++) {
            for (int sütun = 0; sütun <= satir; sütun++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
