package gun19;

public class _01_Methods {
    public static void main(String[] args) {

        int sayi1=3;
        int sayi2=5;
        findEnb(sayi1,sayi2);
        findEnb(45,64);

    }
    public static void findEnb(int a, int b){
        /*
        int a ve int b ye parametre denir. metodun kullanıldığı yer de içine verilen değerlerdir.
        parametre vermenin bir sınırı yoktur. parametreler aynı tipte olmak zorunda değildir.
        parametre isimleri ile dışarıdan gelen verinin isminin aynı olmak zorunda değildir

         */

        if(a>b){
            System.out.println(a);
        }
        else
            System.out.println(b);


    }
}
