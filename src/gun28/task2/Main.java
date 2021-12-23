package gun28.task2;

public class Main {
    public static void main(String[] args) {
        Insan insan1=new Insan();


        insan1.veriAta("ali", 33);
        insan1.adiniSoyle();

        Insan insan2=new Insan();
        insan2.ad="Veli";
        insan2.yas=32;
        insan2.adiniSoyle();
        insan2.veriAta(insan2.ad, insan2.yas);





    }

}
