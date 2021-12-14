package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList {
    public static void main(String[] args) {
        /*
        Kullanııdan 10 tane sayi girmesini  isteyin bu sayılardan çift olanları bir dizi içerisine atın
        ciftSayilar()diye bir metot oluşturun
         */

        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayi girin ");
            sayilar[i]=scanner.nextInt();
        }
        System.out.println("çift sayilar= " + ciftSayilar(sayilar));
        System.out.println("tek sayilar= " + tekSayilar(sayilar));
        ArrayList<Integer> ciftSayilar =ciftSayilar(sayilar);
    }
    public static ArrayList<Integer> ciftSayilar(int[]dizi){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                list.add(dizi[i]);
            }

        }
        return list;

    }
    public static ArrayList<Integer>tekSayilar (int[]array){
        ArrayList<Integer> tekSayilar =new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            if (array[i]%2==1){
                tekSayilar.add(array[i]);
            }

        }
        return tekSayilar;
    }
}
