package day4_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q03My {
    public static void main(String[] args) {

   /*
     Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....

   */

        Scanner scan = new Scanner(System.in);
        System.out.println("fibonnacci dizisi için 47 den küçük tam sayi giriniz!");
        int sayi = scan.nextInt();
        fibonnaci(sayi);
    }

    private static void fibonnaci(int sayi) {
        if (sayi < 47) {
            int sayi1 = 0;
            int sayi2 = 1;
            System.out.print(sayi1 + " ");
            System.out.print(sayi2 + " ");
            for (int i = 0; i < sayi; i++) {
                int sayi3 = sayi1 + sayi2;
                System.out.print(sayi3 + " ");
                sayi1 = sayi2;
                sayi2 = sayi3;
            }

        } else
            System.out.println("47 den küçük xsayi giriniz.");
    }
}