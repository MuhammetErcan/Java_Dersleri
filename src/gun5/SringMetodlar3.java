package gun5;

public class SringMetodlar3 {
    public static void main(String[] args) {
        /*
        string tanımlaması 2 yolla
        1- literal
        2- new kullanarak

        */
        //literal
        String str1 ="Muhammet";

        // new kullanılarak
         String str2 = new String("Türkiye");
        System.out.println(str1);
        System.out.println(str2);
        
        //
        
        String ad = "Muhammet";

        System.out.println(ad.concat(" ercan"));

        System.out.println("Muhammet".concat(" Ercan"));
        System.out.println("Muhammet".concat(" Ercan").concat(" 1A"));
        System.out.println(   ("Muhammet" + " Ercan"+ " 1A").length()  )    ;
        System.out.println("Muhammet".concat(" Ercan").concat(" 1A").length());
        System.out.println("Muhammet".concat(" Ercan").concat(" 1A").length()*10);

        System.out.println("Muhammet" + " Ercan" + " 1A");
        System.out.println(1+1);
        System.out.println("A" + 1 + 2);    // stringle başlayınca yanına ekler toplamaz rakamları;



    }

}
