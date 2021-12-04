package gun15;

public class LabeledLoop {
    public static void main(String[] args) {
       /*
       break sadece içinde bulunduğu döngüyü kırar (continue için de durum aynıdır)
       dışarıdaki döngüyü kırmak için dışardki döngüye izin verilir.
        */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 3) {
                    System.out.println(i + "x " + j + "=" + i * j);
                    break;
                }

            }
            System.out.println();
        }
    }
}
