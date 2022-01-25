package gun47.ornek1;

public  class Baklava extends AbstractSweet {

    public Baklava(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("turkey");
    }


}
