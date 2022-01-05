package gun33.task2;

public class Main {
    public static void main(String[] args) {
        Banka banka1=new Banka(10,"kadiköy",0);
        Banka banka2=new Banka(11,"besiktas",0);

        banka1.paraYatir(30);
        banka1.paraCek(5);
        System.out.println(banka1.kasaBakiyesi);

        banka2.paraYatir(25);
        banka2.paraCek(5);
        System.out.println(banka2.kasaBakiyesi);

        Banka.paraGonder(banka1,banka2,5);
        System.out.println(banka1.kasaBakiyesi);
        System.out.println(banka2.kasaBakiyesi);

    }

}
