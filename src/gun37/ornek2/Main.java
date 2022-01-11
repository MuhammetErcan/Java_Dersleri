package gun37.ornek2;

public class Main {
    public static void main(String[] args) {
        Arac a1=new Arac(Marka.BMW,2020,Tip.SEDAN);
        Arac a2 = new Arac(Marka.MERCEDES,1990,Tip.STATION);

        a1.setFiyat(-1000);
        System.out.println(a1.getFiyat());
        a1.setFiyat(300000);
        System.out.println(a1.getFiyat());
        System.out.println(a1.getMarka());
        a1.setMarka(Marka.DOBLO);
        a2.setTip(Tip.STATION);
        System.out.println(a1.getMarka());
        System.out.println(a2.getTip());
        System.out.println(a1);
        System.out.println(a2);



    }



}
