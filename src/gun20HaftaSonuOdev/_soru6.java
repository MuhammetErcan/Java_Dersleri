package gun20HaftaSonuOdev;

import java.util.Arrays;
import java.util.Scanner;

public class _soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        2B dizinin tüm öğelerini tanımlayın (decleration), deger atayın (initialization) ve yazdırın.
         */

        int[][] dizi = new int[5][5];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + "\t");

            }
            System.out.println();

        }

    }}