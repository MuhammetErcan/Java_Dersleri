package gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        // list lerden tek farkı tekrar eden veri tutmaz.

        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(3); // tekrar eden veri olduğu için eklemez

        System.out.println("hashSet = " + hashSet);

    }
}
