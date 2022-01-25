package gun47.ornek1;

public abstract class AbstractFood {
    private String name;

    public AbstractFood(String name) {
        this.name = name;
    }


    public abstract void madeIn();

    public abstract void taste();

    public String getName() {
        return name;
    }
}
