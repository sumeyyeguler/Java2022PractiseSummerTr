package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamaklı bir tam sayi giriniz : ");
        String sayi1 = scan.next();

        if (sayi1.length() == 5) {
            int sayi = Integer.parseInt(sayi1);
            int birler = sayi % 10;
            sayi = sayi / 10;
            int onlar = sayi % 10;
            sayi = sayi / 10;
            int yuzler = sayi % 10;
            sayi = sayi / 10;
            int binler = sayi % 10;
            sayi = sayi / 10;
            int onBinler = sayi % 10;
            System.out.println("5 basamaklı sayinin ilk 2 ve son 2 basamak toplamı : " + (birler + onlar + onBinler + binler));
        }else System.out.println("girdiğiniz sayının 5 basamaklı olup olmadıgını kontrol ediniz.");

    }

}
