package gun5;

public class StringMetodlar2 {
    public static void main(String[] args) {

        // 4 - concat
        // 5- indexOf
        // 6- lastindexOf

        String ilKisim ="Bugün hava";
        String ikinciKisim = "cok güzel";

        System.out.println(ilKisim + " " + ikinciKisim);

        String tamCumle = ilKisim.concat(" cok güzel");
        System.out.println(tamCumle);

        System.out.println(tamCumle.indexOf("ü")); // ü' nün sırsaı

        System.out.println(tamCumle.indexOf("gün")); // ilk g olduğu için onun sayısını varır.

        System.out.println(tamCumle.indexOf("j"));  // olmayan değer -1 veriyor.

        System.out.println(tamCumle.indexOf(" g"));  // boşluk g 14

        System.out.println(tamCumle.indexOf(" gj"));  // - 1

        System.out.println(tamCumle.indexOf(" gü"));   // 14
        System.out.println(tamCumle.indexOf("ugü"));    //1
        
        ///
        
        String cümle = "Haftanın beşinci gününde son dersteyiz";
        String sonKelime = cümle.substring(29);

        System.out.println("sonKelime = " + sonKelime);

        ///

        String cumle2 = "Yarin hafta sonu tatil geldi";
        int cumleBaslangic = cumle2.indexOf("g");
        int cumleSonu = cumle2.length();
        System.out.println(cumle2.substring(cumleBaslangic,cumleSonu));
        System.out.println(cumle2.substring(cumleBaslangic));


        






    }

}
