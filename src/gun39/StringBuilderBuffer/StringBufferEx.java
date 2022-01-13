package gun39.StringBuilderBuffer;

public class StringBufferEx {
    public static void main(String[] args) {
        // immutable

        String str ="Java";
        str.substring(1,3);

        //mutable  (her kelime arrayin bir elemanı gibi )
        StringBuffer strBuf=new StringBuffer();
        strBuf.append("Java");      // --> "ekle"
        System.out.println(strBuf);
        strBuf.reverse();           // --> tersten yazdırma
        System.out.println(strBuf);



    }
}
