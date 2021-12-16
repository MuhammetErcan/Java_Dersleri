package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5,6,7,8));

        // bu iki hash seti birleştiren bir metot yazalim
        HashSet<Integer> birlestirme = new HashSet<>();

        birlestirme.addAll(hashSet1);// önce 1. seti ekledi      --> addAll
        birlestirme.addAll(hashSet2);// sonra 2. seti ekledi



        // bu iki hash setin farkını
        HashSet<Integer> farkSet = new HashSet<>(hashSet1);  // farkSet.addAll(hashSet1)
        farkSet.removeAll(hashSet2);

        // hashSet1.removeAll(hashSet2); ama bunu yaptığımız zaman hashSet1 içindeki 5 artık kaldırılır


        // ortak elemanları bulan metot
        HashSet<Integer>ortakSet = new HashSet<>(hashSet1);//                           -->retainAll
        ortakSet.retainAll(hashSet2);


    }

}
