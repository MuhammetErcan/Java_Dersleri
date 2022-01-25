package gun47.ornek2;

public class Bus extends Vehicle implements Diesel {
    public Bus(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeDiesel() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public void method() {
        Diesel.super.method();
    }
}
