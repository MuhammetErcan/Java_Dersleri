package gun22;

import java.util.Scanner;

public class _Mentor1 {
    public static void main(String[] args) {
        //    A school has following rules for grading system:
        //    a. Below 25 - F
        //    b. 25 to 45 - E
        //    c. 45 to 50 - D
        //    d. 50 to 60 - C
        //    e. 60 to 80 - B
        //    f. Above 80 - A
        //    Ask user to enter marks and print the corresponding grade.
Scanner scanner = new Scanner(System.in);
int not = scanner.nextInt();
        if (not<25)
            System.out.println("f");
        else if (not<45)
            System.out.println("e");
        else if (not<50)
            System.out.println("d");
        else if (not<60)
            System.out.println("c");
        else if (not<80)
            System.out.println("b");
        else if (not>80)
            System.out.println("a");

    }
}
