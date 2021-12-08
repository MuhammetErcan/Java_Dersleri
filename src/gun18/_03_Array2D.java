package gun18;

public class _03_Array2D {
    public static void main(String[] args) {
        /*
        5-5 lik bir tabloyu 0-10 arası sayılarla doldurup yazın
         */
        int[][] tablo = new int[5][5];

        //tabloyu oluşturmak için

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 10);

            }

        }// tabloyu consola yazdırmak için
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + " ");

            }
            System.out.println();
        }
    }
}