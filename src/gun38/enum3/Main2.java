package gun38.enum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String girilen=scanner.nextLine();

        ArrayList<Günler> list=new ArrayList<>(Arrays.asList(Günler.PAZARTESI,Günler.SALI,Günler.CARSMBA,Günler.PERSEMBE,Günler.CUMA,Günler.CUMARTESI,Günler.PAZAR));

        System.out.println(Günler.valueOf(girilen).ordinal());

    }
}
enum Günler{
    PAZARTESI, SALI, CARSMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR,;
}
