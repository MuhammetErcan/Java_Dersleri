package gun17;

import java.util.Scanner;

public class _Odev_Soru2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum. \n" +
                "        Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi. \n" +
                "        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.\n";

        String[] cumleler = str.split("\\.");  // (\\.) regex kurali olduğu için
        String duzenlenmis="";
        cumleler[2]+=" java";  // 3. cümle

        for (int i = 0; i < cumleler.length; i++) {
           duzenlenmis+= cumleler[i]+".";

        }


            System.out.println(duzenlenmis);
        }


    }

