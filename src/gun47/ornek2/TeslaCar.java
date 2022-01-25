package gun47.ornek2;

public class TeslaCar extends Vehicle implements Electric{
    public TeslaCar(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeBattery() {
        return null;
    }

     public String drive(){
        return "araci sürüyorum";
    }

}
