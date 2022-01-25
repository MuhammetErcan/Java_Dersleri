package gun47.ornek2;

public class ToyotaPrius extends Vehicle implements Electric, Gas{
    public ToyotaPrius(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeBattery() {
        return null;
    }

    @Override
    public String changeOil() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public void method() {
        Electric.super.method();
    }
}
