package gun20;

import java.util.Scanner;

public class _02_MethodsReturnType {
    public static void main(String[] args) {
        // Kullanıcıdan 5 tane meyve girmesini isteyin.
        // Bu meyvelerden kaç tanesinde e harfi olduğunu bulan bir metot yazın.
        Scanner scan = new Scanner(System.in);
        String []meyveler =new String[5];

        for (int i = 0; i < meyveler.length; i++) {
            System.out.println("Meyve İsmi");
            meyveler[i]=scan.nextLine();

        }
        int kacTaneE =kacTaneEVar(meyveler);
        System.out.println("kactaneE"+kacTaneE);
    }
    public static int kacTaneEVar(String[]array){
        int eMiktar =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("e")){
                eMiktar++;
            }
        }       return eMiktar;

    }
}
