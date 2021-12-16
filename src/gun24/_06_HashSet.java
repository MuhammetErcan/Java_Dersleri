package gun24;

import javax.naming.spi.ObjectFactory;
import java.util.ArrayList;
import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet =new HashSet<>();
        // bu sadece int tutabilir.

        HashSet<String> stringHashSet=new HashSet<>();
        // bu sadece String veri tutar

        HashSet<Object> objectHashSet =new HashSet<>(); // object burada veri tipidir.
        ArrayList<Object> objectArrayList = new ArrayList<>();
        Object[] array = new Object[5];
        // object deyince hem string hem int hem ... tanımlayavilirsin sadece hashSet te değil diğerlerinde de kullanılır

        objectHashSet.add(34);
        objectHashSet.add("mehmet");
        objectHashSet.add(true);
        objectHashSet.add(3.14);

        System.out.println("objectHashSet = " + objectHashSet);

        }

    }


