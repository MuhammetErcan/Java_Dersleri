package gun24;

import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler = new HashSet<>();
        //Hashset kuralı uygulayan class <String> veya <Integer> veri tipi  

        renkler.add("blue");
        renkler.add("red");
        renkler.add("black");
        renkler.add("blue");
        renkler.add("yellow");
        
        // 1. yazdırma şkli
        System.out.println("renkler = " + renkler);

        
        //2.yazdırma şekli 
        for (String renk: renkler){
            System.out.println("renk = " + renk);
        }





    }
}
