package gun37;

public class NonAccessModifiers {

    /*
        Access modifiers -> ulasim ile ilgili
        Non-Acces Modifoiers -> fonksiyonellikle ilgili
        static, final, abstract (daha sonra islenecek)
     */

    int a;          // nesne elemanlari, her nesne icin farkli
    static int b;   // class elemanlari

    public static void main(String[] args) {
        b = 1;
        //a = 2;  // a nesnenin elemanidir
        NonAccessModifiers n1 = new NonAccessModifiers();
        n1.a = 10;
        NonAccessModifiers n2 = new NonAccessModifiers();
        n2.a = 20;
        NonAccessModifiers n3 = new NonAccessModifiers();
        n3.a = 30;

    }

    public static void classMethod(NonAccessModifiers n){
        System.out.println(n.a);
    }

    public void method(){
        a = 1;
        b = 10;
    }


}