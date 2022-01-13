package gun39.ornekler;

import java.util.Scanner;

public class Ornek1 {
    /*
    Kullanıcıdan bir cumle alın, bu cumleyi StringBuildera ekleyin
    sonra kullanıcıdan ayri bir kelime ve hangi index den itibaren ekleneceğini alın
    bu kelimeyi istnilen indexten itibaren ekleyin ve ekrana yazın
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir cümle girin");
        String girilenCumle=scanner.nextLine();

        stringBuilder.append(girilenCumle);
        System.out.println("bir kelime girin");
        String kelime = scanner.nextLine();
        System.out.println("hangi indexten itibaren eklemek istiyorsunuz");
        int index = scanner.nextInt();
            try {
                System.out.println(stringBuilder.insert(index,kelime));

            } catch (Exception e) {
            System.out.println("girdiğiniz index mevcut değil");
        }


        }







    }
