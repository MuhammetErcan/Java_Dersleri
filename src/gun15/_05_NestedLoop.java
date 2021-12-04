package gun15;

public class _05_NestedLoop {
    public static void main(String[] args) {
        /*
        10 a kadar çarpım tablosunu yazdırın
         */
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                int carpim=i*j;
                System.out.println(i+ "* " + j + "=" + carpim );
            }
            System.out.println();
        }
    }
}
