package gun15OdevSorular;

import java.util.Scanner;

public class _Soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan iki sayı girmesini isteyen bir do-while döngüsü yazın. Sayılar eklenmeli ve
        toplam görüntülenmelidir. Döngü, kullanıcıya işlemi tekrar yapmak isteyip istemediğini sormalıdır.
        Eğer öyleyse, döngü tekrar etmelidir; aksi halde sonlandırılmalıdır.
         */
        String kelime;
        do {
            System.out.println("2 tamsayi girin");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();

            System.out.println("toplam =" + (sayi1+sayi2));
            System.out.println("devam etmek istiyor musunuz? -- 'y' or 'n'");
            scanner.nextLine();
            kelime = scanner.nextLine();
        } while (kelime.equalsIgnoreCase("y"));
        if (!kelime.equalsIgnoreCase("y")){
            System.out.println("program sonlandı");
        }
    }
}
