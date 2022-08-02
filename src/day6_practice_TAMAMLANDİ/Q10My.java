package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q10My {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz :");
        String str = scan.next();
        System.out.println("sayı giriniz :");
        int tekrar = scan.nextInt();

        System.out.println(tekrarla(str, tekrar));

    }

    private static String tekrarla(String str, int tekrar) {
        str = str.substring(0, 1) + str.substring(str.length() - 1);
        String str1 = "";
        for (int i = 1; i <= tekrar; i++) {
            str1 += str;
        }
        return str1;
    }
}
