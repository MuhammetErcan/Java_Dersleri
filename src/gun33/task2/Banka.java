package gun33.task2;

public class Banka {
    int id;
    String subeAdi;
    int kasaBakiyesi;

    public Banka(int id, String subeAdi, int kasaBakiyesi) {
        this.id = id;
        this.subeAdi = subeAdi;
        this.kasaBakiyesi = kasaBakiyesi;
    }

    public Banka(int id, String subeAdi) {
        this.id = id;
        this.subeAdi = subeAdi;
    }

    public void paraYatir(int x){
        if (x>0){
            kasaBakiyesi+=x;
        }
        else
            System.out.println("yanlış miktar girdiniz");
    }

    @Override
    public String toString() {
        return "Banka{" +
                "id=" + id +
                ", subeAdi='" + subeAdi + '\'' +
                ", kasaBakiyesi=" + kasaBakiyesi +
                '}';
    }

    public void paraCek(int x){
        if (x<kasaBakiyesi){
            kasaBakiyesi-=x;
        }else
            System.out.println("Hesabınızda çekmek istediğiniz miktar bulunmamaktadır");
    }

    public static void paraGonder(Banka paraCekilecekBanka, Banka paraGidecekBanka, int miktar){
        paraCekilecekBanka.kasaBakiyesi-=miktar;
        paraGidecekBanka.kasaBakiyesi+=miktar;


    }
}
