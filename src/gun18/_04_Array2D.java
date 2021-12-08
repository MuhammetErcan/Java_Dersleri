package gun18;

import java.util.Scanner;

public class _04_Array2D {
    public static void main(String[] args) {
        /*
        öğrencilerin vize ve final notlarını girebileceği
        bir program yazın. kaç öğenci olacağını da alın
         */

        Scanner scanner = new Scanner(System.in);
        int ogrenciSayisi = scanner.nextInt();

        int [][] notlarTablosu = new int[ogrenciSayisi][2];

        for (int i = 0; i <notlarTablosu.length ; i++) {
            for (int j = 0; j < notlarTablosu[i].length; j++) {
                System.out.println("vize notu");


            }

        }



    }
}
