package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(5,6,7,8));

        // bu iki hash seti birleştiren bir metot yazalim
        System.out.println("birleştirilmiş hali=" + birlestir(hashSet1,hashSet2));


        // bu iki hash setin farkını bulalım
        System.out.println("Farkları= " +fark(hashSet1,hashSet2));

        // ortak elemanları bulan metot
        System.out.println("ortak elemanları= " +ortakElemanlar(hashSet1,hashSet2));


    }
    public static HashSet<Integer>birlestir( HashSet<Integer> hashSet1, HashSet<Integer> hashSet2){

        HashSet<Integer> birlesikSet = new HashSet<>();

        birlesikSet.addAll(hashSet1);// önce 1. seti ekledi      --> addAll
        birlesikSet.addAll(hashSet2);// sonra 2. seti ekledi
        return birlesikSet;
    }
    public static HashSet<Integer>fark (HashSet<Integer> hashSet1, HashSet<Integer> hashSet2){
        HashSet<Integer> farkSet = new HashSet<>(hashSet1);
        farkSet.removeAll(hashSet2);  // farkset değikenine hashSet1 i eklemiştik üst satirda   -->removeAll

        return farkSet;

    }
    public static HashSet<Integer>ortakElemanlar(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2){

        HashSet<Integer>ortakSet = new HashSet<>(hashSet1);//                           -->retainAll
        ortakSet.retainAll(hashSet2);

        return ortakSet;
    }
}
