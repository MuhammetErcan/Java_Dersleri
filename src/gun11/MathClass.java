package gun11;

public class MathClass {
    public static void main(String[] args) {
        int sayi1 = -15;
        int sayi2=4;

        System.out.println("sayi nin mutlak değer = " + Math.abs(sayi1));// a nın mutlak değeri
        System.out.println("sayi1 ve sayi2den büyük olan= " + Math.max(sayi1,sayi2));
        System.out.println("sayi1 ve sayi2den küçük olan= " + Math.min(sayi1,sayi2));
        System.out.println("sayi2 nin karekökü= " + Math.sqrt(sayi2));

        System.out.println("2, 4 ve 8 arasından büyük olan = " + Math.max(2,Math.max(4,8)));

        System.out.println("2.nin 3 üncü kuvveti= "+ Math.pow(2,3));
    }
}
