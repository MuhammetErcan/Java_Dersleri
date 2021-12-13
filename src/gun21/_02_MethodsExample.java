package gun21;

public class _02_MethodsExample {
    public static void main(String[] args) {
        /*
        faktöriyel hesaplayan bir metot yazın
         */
        faktoriyelHesapla(12);
        faktoriyelHesapla(3);
        faktoriyelHesapla(9);

    }
    public static void faktoriyelHesapla (int sayi){
        int faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;

        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
