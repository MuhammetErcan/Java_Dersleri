package gun15OdevSorular;

public class _Soru18_6 {
    public static void main(String[] args) {
        /*
             1
            222
           33333
          4444444
         555555555
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j =i; j >=0; j--){
                System.out.print(j+1);

            }
            for (int j =i; j >0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
