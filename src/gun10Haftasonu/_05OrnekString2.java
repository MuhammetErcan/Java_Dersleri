package gun10Haftasonu;

public class _05OrnekString2 {
    public static void main(String[] args) {
        String str = "Java nxxxxxasil";
        int ilkA = str.indexOf("a");
        System.out.println(ilkA);

        int ikinciA = str.indexOf("a", ilkA+1);
        System.out.println(ikinciA);


        int ucuncuA = str.indexOf("a", ikinciA+1);
        System.out.println(ucuncuA);
    }
}
