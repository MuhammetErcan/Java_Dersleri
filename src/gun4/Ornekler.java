package gun4;

public class Ornekler {

    public static void main(String[] args) {

        int maas= 6000;
        int kira = 1000;
        int faturalar =1000;
        int ikramiye = 6000;
        int tatil =2000;
        int market =1000;

        int kalanPara= maas-kira-faturalar+ikramiye-tatil-market;

        System.out.println("kalan para= "+ kalanPara);

    }
}
