package gun16;

public class _02_Array {
    public static void main(String[] args) {

        String str = "Hello world";
        String[] strArray = new String[6]; // 1. tanımlama şekli
        String[] array = {"hello" , "merhaba", "hallo"};

        strArray[0]="";// hiçbir değer yok. yokluk diyebiliriz.
        strArray[2]=" "; // değeri boşluk. bir değeri var
        strArray[4]="Hello";
        strArray [5]= "I love Java";

        for (int i = 0; i < strArray.length; i++) {
            /*
            String array lerde indislere değer atanmaz ise default null değeri çıktı olarak verir.

             */


            System.out.println(strArray[i]);

        }
    }
}
