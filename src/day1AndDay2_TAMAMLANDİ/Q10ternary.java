package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q10ternary {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yes için Y, No için N giriniz : ");
        String secim = scan.next().toUpperCase();

        System.out.println(secim.equals("Y")? "YES":secim.equals("N")?"NO":"geçerli karakter giriniz");
    }
}
