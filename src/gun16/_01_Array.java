package gun16;

public class _01_Array {
    public static void main(String[] args) {


        int intDeger = 35;
        int []intArray=new int[5]; // 1.tanımlama şekli
        int [] array = {1,2,45,56,78}; // 2. tanımlama şekli

        // 5 tane sayi int deger tutabilir sayıyı değiştirip tutabilceği
        // sayiyiyi artırıp azaltabilirm . negatif sayı yazılmaz
        // 0 1 2 3 4 --> indis numaraları

        intArray[0]=3;
        intArray[2]=5;
        intArray[4]=-25;

        for (int i = 0; i < intArray.length; i++) {
            // 1 ve 3. indislere atama yapılmadı. dii int olduğu için default sıfır değeri atandı
            System.out.println(intArray[i]);

        }

    }
}
