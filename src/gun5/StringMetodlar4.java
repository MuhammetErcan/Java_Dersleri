package gun5;

public class StringMetodlar4 {
    public static void main(String[] args) {
        //  text  : j a v a    --> length() = 4
        //  index : 0 1 2 3
        //
        String text = "Java güzel bir dildir Java Script";

        System.out.println(text.indexOf(" "));
        System.out.println(text.lastIndexOf(" "));


        // text cümlesinde ilk ve son kelimeleri bulup concat edin ve uzunlugunu bulun
        // Javadildir, 10
        // ilk ' ' un indexi 4, son boslugun indexi 14

        int ilkBoslukIndexi = text.indexOf(" ");
        int sonBoslukIndexi = text.lastIndexOf(" ");

        String ilkKelime = text.substring(0, ilkBoslukIndexi);
        String sonKelime = text.substring(sonBoslukIndexi+1);

        String birlesmisKelime = ilkKelime.concat(sonKelime);
        System.out.println(birlesmisKelime + ", " + birlesmisKelime.length());

    }


}
