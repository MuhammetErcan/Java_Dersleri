package gun41;

public class _04UncheckedException {
    /*
    Unchecked Expection --> Compiler'ın kontrol etmediği Exceptionlar
    checked Expection --> Compiler'ın kontrol ettiği Exceptionlar
     */
    public static void main(String[] args) {
        int a = 5;
        int b=0;
        System.out.println(a/b);
    }
}
