package gun8;

public class TipDonusumleri {
    public static void main(String[] args) {

        // Integer.parseInt
        //string bir ifadeyi inte çevirir (sadece sayısal dğer olmalı boşluk olmamalı yada başka karqakter)

        String str ="1234";
        int intdeger = Integer.parseInt(str);
        System.out.println(intdeger);

        //double.parseDouble
        double doubleDeger = Double.parseDouble(str);
        System.out.println(doubleDeger);


        // double ı int e çevirme -->
        //eşitliğin sağ tarafına küçük değişkenin tipini parante içinde yazmak lazım
        // double>float>long>int>short>byte

        double doubleDegisken =12;
        int intDegisken = (int) doubleDegisken;
        float f = (float)doubleDegisken;

        // stringe çevirme
        // valueOf

        int i = 1234;
        String strInt= String.valueOf(i);
        System.out.println(strInt);
        double d = 1234.5;
        String strDouble =String.valueOf(d);
        System.out.println(strDouble);




    }
}
