package gun7;

public class _02StringMetotlar {
    public static void main(String[] args) {

        //---isEmpty

        String str = "Java alistirmalar6";
        String str2 = "";

        System.out.println(str.isEmpty());   //string ifadeye bakar boş mu değil mi diye
        System.out.println(str2.isEmpty());   //boş ise true cevabı verir değilse false

        // startsWith

        System.out.println(str.startsWith("J"));   // sTRİNG İFADENİN başlangıç harfini
        System.out.println(str.startsWith("j"));

        // endsWith

        System.out.println(str.endsWith("r"));      // string ifadenin son harfini kontrol
        System.out.println(str.endsWith("R"));

        // Replace

        // Replace metodu verdiğimiz string ya da char değişkenini eski harf ile değiştirir.
        //String olarak tanımlar isek kelime ve hatta cümlenin tamamını değiştirebiliriz.

        String strReplaceChar = str.replace('a','s');
        String strReplaceString = str.replace("a","s");

        System.out.println(strReplaceChar);
        System.out.println(strReplaceChar);

        //RelaceFirst
        // bu kisimda ise verilen harfi cümlede ilk geçtiği yerde değitirir.

        String strReplaceFirst = str.replaceFirst("a","*");
        System.out.println(strReplaceFirst);

        // ReplaceAll

        // a-z arasındaki küçük harflerin yerine * yazar
        // türkçe karakterlerde değişiklik yapmıyor

        String  strReplaceAll = str.replaceAll("[a-z]","*");

        System.out.println(strReplaceAll);

        String  strReplaceAll2 = str.replaceAll("[^a-z]","*"); // a-z arasındakiler hariç tüm
                                                                                // karakterlerin yerine * yapar
                                                                     // türkçe karakterlerde değişiklik yapmıyor

        System.out.println(strReplaceAll2);




    }
}
