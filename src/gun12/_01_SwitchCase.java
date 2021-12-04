package gun12;

import java.util.Scanner;

public class _01_SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bugün haftanin kaçinci günü?");
        int day =scanner.nextInt();

        switch (day) {
            case 1 :
                System.out.println("bugün pazartesi");
                break;  // programın burada sonlanmasını sağlar
                        // break sadee switch-case e ait bir komut değil
            case 2 :
                System.out.println("bugün sali");
                break;
            case 3 :
                System.out.println("bugün çarşamba");
                break;
            case 4 :
                System.out.println("bugün perşembe");
                break;
            case 5 :
                System.out.println("bugün cuma");
                break;
            case 6 :
                System.out.println("bugün cumartei");
                break;
            case 7 :
                System.out.println("bugün pazar");
                break;
            default:
                System.out.println("geçersiz işlem");


        }

    }
}
