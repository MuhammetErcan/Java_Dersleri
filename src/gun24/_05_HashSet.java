package gun24;

import java.util.HashSet;

public class _05_HashSet {
    public static void main(String[] args) {
        /*
        1-10 arası random sayilarla 10 elemanlı  bir seti doldurun
         */

        HashSet<Integer> randomSet=new HashSet<>();
        while (randomSet.size()<10) {

            int num = (int) (Math.random() * 10);
            randomSet.add(num);
        }
        System.out.println("randomSet = " + randomSet);

        // oluşturduğumuz bu seti bir diziye atalım

        // 1.yol

        }

    }


