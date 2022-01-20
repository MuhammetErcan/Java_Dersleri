package gun43.pack1;

import gun43.pack2.Otobus;

public class Main1 {

    public static void main(String[] args) {
        Otomobil o = new Otomobil();
        o.publicVar = "1";
        o.protectedVar = "2"; // ayni package"da oldugu icin
        o.defaultVar = "3";
        //o.privateVar = "3";  -> ulasilamaz
        o.publicMethod();
        o.protectedMethod();
        o.defaultMethod();

    }
}