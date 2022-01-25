package gun47.ornek1;

public class CheeseCake extends AbstractSweet {

    public CheeseCake(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("USA");
    }


}
