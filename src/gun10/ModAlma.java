package gun10;

import java.util.Scanner;

public class ModAlma {
    public static void main(String[] args) {
        /*
        bir sayının modunu almak için bolme işlemi yapılır ve sonuç kalan değerdir.
         */
        int sayi = 11;
        int modHali = sayi%10;
        System.out.println("modHali = " + modHali);
        /*
        eğer modu alınacak sayı mod değerinden küçükse kendisini verir.
         */
        int sayi2 =2;
        int modhali2= sayi2&10;
        System.out.println("modhali2 = " + modhali2);

        //kullanıcıdan 3 haneli bir sayı girmesini isteyin ve sayının birler basamağını bulun

        Scanner scanner=new Scanner(System.in);

        System.out.println("3 basamaklı bir sayi girin");
        int num =scanner.nextInt();

        int birlerBasamagi= num%10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);

        //kullanıcıdan 3 haneli bir sayı girmesini isteyin ve sayının onlar basamağını bulun
        System.out.println("3 basamaklı bir sayi girin");
        int num2= scanner.nextInt();
        int onlarBasamagi= (num2/10)%10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);

        //kullanıcıdan 3 haneli bir sayı girmesini isteyin ve sayının yüzler basamağını bulun
        System.out.println("3 basamaklı bir sayi girin");
        int num3= scanner.nextInt();
        int yuzlerBasamagi =(num3/100)%10;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        /*
        kullanıcıdan bir sayi girmesini isteyin
        eğer sayi çift ise ekrana çift tek ise ekrana tek yazdırın
         */
        System.out.println("bir tam sayi girin");
        int tekVeyaCift=scanner.nextInt();
        if(tekVeyaCift%2==0){
            System.out.println("sayi çifttir");
        }
        else {
            System.out.println("sayi tektir");
        }




    }
}
