package gun27.task2;

public class Dog {
    // instance var, new ile oluşturulanlar
    String name;
    String cins;
    int yas;
    String sahip;

    // class vars, bir tanedir. nesnede oluşturulmazlar.
    static int count;

    public static void main(String[] args) {
        Dog d1 = new Dog();
    }

    // Dog türünden oluşturulan nesneye ait
    public void havla(){
        System.out.println("ben " + name + ", havladim");
    }

}
