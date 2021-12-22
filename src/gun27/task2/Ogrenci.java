package gun27.task2;

// class isimleri genellikle nesne isimleri gibi olur
//Büyük harfle başlar, camelStyle şeklinde yazılır
public class Ogrenci {
    // öğrenci bilgileri vardır
    //fields, attributes

    String name;
    int number;

    // static tanımlnmayan tüm variable ve metotlar nesneye aittir.

    //behaviour, davranış
    //küçük harfle barşlar, camelstyle, hareket içeren giiler kullanılır.
    public void konus(){
        System.out.println("konuşuyorum");
    }
    public void adiniSoyle(){
        System.out.println("adim:" + name + ", numara: " + number);
    }
}
