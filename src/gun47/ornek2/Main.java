package gun47.ornek2;

public class Main {
    public static void main(String[] args) {

        Vehicle teslaCar = new TeslaCar(Model.TESLA101, 2020);
        Vehicle toyotaPrius = new ToyotaPrius(Model.TOYOTAPRIUS30, 2019);
        Vehicle bus = new Bus(Model.BUS403, 2010);

        Utils.writeKnowledges(teslaCar);
        Utils.writeKnowledges(toyotaPrius);
        Utils.writeKnowledges(bus);

        System.out.println();

        System.out.println(((TeslaCar) teslaCar).drive());



    }
}
