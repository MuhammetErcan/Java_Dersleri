package gun15;

public class _04_NestedLoop {
    public static void main(String[] args) {
        /*
        *****

         */
        for (int satir = 1; satir <= 5; satir++) {
            for (int sütun = 5; sütun >= satir; sütun--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
