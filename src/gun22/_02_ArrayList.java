package gun22;

import java.util.ArrayList;
import java.util.Collections;

public class _02_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(78);
        list.add(76);

        System.out.println("listin ilk hali = " + list);


        // Diziler için Arrays.sort() metodu yerine listler için bu kullanılır
        Collections.sort(list);     //                          -->Collections.sort
        System.out.println("list e düzenlendikten sonra = " + list);

        Collections.reverse(list);  //                          -->Collections.reverse
        System.out.println("list yi tersten yazdırma  = " + list);

        System.out.println("list max değer= " + Collections.max(list));  //--> Collections.max
        System.out.println("list min değer= " + Collections.min(list));   //--> Collections.min

        Collections.fill(list,3); // listedeki tüm verilerin yerine yazdığımız veriyi ekler   -->Coolections.fill
        System.out.println("list = " + list);

        Collections.replaceAll(list,3,45); // liste içindeki eski verinin yerine yeni veri --> Collections.replaceAll
        System.out.println("list = " + list);





    }
}
