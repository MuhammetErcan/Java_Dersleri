package gun27.task3;

public class Main {
    public static void main(String[] args) {
        Arac arac1 = new Arac();
        arac1.marka="BMW";
        arac1.yil=2021;

        calis(arac1.marka,arac1.yil);
        kornaBas(arac1.marka,arac1.yil);
        stopEt(arac1.marka, arac1.yil);

        /*
        2 tane araç nesnesi oluşturup verileri tanımlanp metotları çalıştırılacak
         */
    }

    static class Arac {

        String marka;
        int yil;
    }

        public static void calis(String marka, int model){
            System.out.println("adı" + marka + "modeli" + model + "çalıştı");
        }
        public static void kornaBas(String marka, int model) {
            System.out.println("adı" + marka + "modeli" + model + "korna bastı");
        }
        public static void stopEt(String marka,int model) {
            System.out.println("adı" + marka + "modeli" + model + "stop etti");
        }

    }

