package gun51;

import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args) {

        LocalTime t1=LocalTime.now();
        long toplam=0;
        for (int i = 0; i < 10000000; i++) {
            toplam+=i;
        }

        System.out.println(toplam);

        LocalTime t2=LocalTime.now();
        System.out.println(t1+ " , " + t2);





    }
}
