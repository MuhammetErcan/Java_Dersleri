package gun14;

public class _01_Forloop {
    public static void main(String[] args) {
        int intDeger =0;
        while (intDeger<10) {
            System.out.println("intDeger = " + intDeger);
            intDeger++;
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 10; i >0 ; i++) {
            System.out.println("i = " + i);

        }
        /*
        while döngüsü başlangıç biti değeri belli olmayan döngü için kullanılır.
        for döngüsü ise başlangıç ve bitiş değeri belli olan durumlar için kullanılır
         */
    }

}
