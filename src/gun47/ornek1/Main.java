package gun47.ornek1;

public class Main {
    public static void main(String[] args) {
        AbstractFood baklava=new Baklava("Baklava");

        System.out.println(baklava.getName());
        baklava.madeIn();
        baklava.taste();

    }
}
