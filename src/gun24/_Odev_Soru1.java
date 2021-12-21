package gun24;


import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class _Odev_Soru1{
    private static Object String;

    public static void main(String[] args) {
        // aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek
        // bir metot yazin.
        //  ciktisi bu sekilde olacaktir ->
        //  3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.
        String str = "aaaabbfffgggggtttddd";
        String [] array =str.split("");
        HashSet stringTreeSet=new HashSet(Arrays.asList(array));

        duzenli(str,array,stringTreeSet);

    }

    public static int count(String str1, String[] array2) {
        array2 = str1.split("");
        int miktar=0;
        for (int i = 0; i < array2.length; i++) {
             miktar = 0;
            for (int j = 0; j < array2.length; j++) {

                if (array2[i].contains(array2[j])) {
                    miktar++;
                }
                else
                    miktar=0;
                     miktar++;
                }
                }
        return miktar;
            }
    public static void duzenli(String str, String[] array, HashSet<String>stringHashSet) {
        array=str.split("");
        stringHashSet=new HashSet<>(Arrays.asList(array));
        String yeni="";
        for (String harf : stringHashSet) {
            yeni+=count(str,array)+harf;
        }
        System.out.println(yeni);
    }
}