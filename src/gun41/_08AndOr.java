package gun41;

public class _08AndOr {
    public static void main(String[] args) {

        int i =10;
        int j = 10;

        if (i++>5 || j-- <5){
            System.out.println(i+ " , " + j);

        }

        int a =10;
        int b = 10;

        if (i++>5 | j-- <5){
            System.out.println(a+ " , " + b);

        }
    }
}
