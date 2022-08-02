package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q04me {
    public static void main(String[] args) {
        /*0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
        kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
        cikis "Gecersiz" olmalidir
        NestedIf ve Ternary kullanarak 2 yolla da cozunuz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("0-9 arasında bir rakam giriniz :");
        int sayi = scan.nextInt();

        if (sayi >= 0 && sayi < 10) {
            switch (sayi) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
                default:
                    System.out.println("sıfır");
            }
        }else System.out.println("geçersiz");

    }
}
