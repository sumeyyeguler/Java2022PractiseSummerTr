package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q10equals {
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

        if (secim.equals("Y")){
            System.out.println("YES");
        }else if (secim.equals("N")){
            System.out.println("NO");
        }else System.out.println("geçerli karakter giriniz ");
    }
}
