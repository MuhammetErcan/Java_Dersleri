package gun17;

import java.util.Arrays;

public class _03_ArrayMetodlari {
    public static void main(String[] args) {
        /*  Arrays.sort
        5 elemanlı bir dizi oluşturun ve elemanları küçükten büyüğe sıralayın
         */

        int[] nums = {23,34,12,7,88};
        System.out.println("sort() tan önce=> " + Arrays.toString(nums));
        Arrays.sort(nums);
        // sort() metodu dizinin elemanlari küçükten büyüğe siralar.
        // bu kullanım sout içerisine yazılmaz

        System.out.println("sort() tan sonra=>" + Arrays.toString(nums));
    }
}
