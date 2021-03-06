package gun15;

public class _01_NestedLoop {
    public static void main(String[] args) {
        /*
        1 ile 5 arasındaki sayılatın toplam tablosunu ekrana yazdıırın.

        1+1=5
        1+2=3
        1+3=4
        1+4=5
        1+5=6

        2+1=3
        2+2=4
        ...


        5+5=10
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) { //dışarıdaki for döngüsünün her adımı için 5 kere çalışır.
                int toplam = i+j;
                System.out.println(i+ "+"+j+ "=" +toplam);
            }
            System.out.println(); //içerideki döngü bittikten sonra alt satıra inmeyi sağlar
        }
    }
}
