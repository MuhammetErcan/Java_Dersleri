package gun41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02MultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" birinci sayi girin");
            int a = sc.nextInt();

            System.out.println("ikinci sayi girin");
            int b = sc.nextInt();

            System.out.println(a + "/" + b + "=" + (a / b));
        } catch (ArithmeticException e){
            System.out.println("sayi sifira bölünmez");

        } catch (InputMismatchException e ){
            System.out.println("Sayi girmeniz lazım");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
