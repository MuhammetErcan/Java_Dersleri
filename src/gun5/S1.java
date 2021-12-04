package gun5;

public class S1 {
    public static void main(String[] args) {
        String text = "Java dünyasina hosgeldiniz";
        String ayrac = "dünya";

        //textin 4. indexine kadar olan kelimeyi bulun
        int i = text.indexOf(ayrac);
        String ilkKelime = text.substring(0, i);
        System.out.println(ilkKelime);


        //
        System.out.println("----------------------------");
        String d = "türkiye";
        String a = "k";

        System.out.println(d.length());
        System.out.println(d.indexOf(a));
    }
}
