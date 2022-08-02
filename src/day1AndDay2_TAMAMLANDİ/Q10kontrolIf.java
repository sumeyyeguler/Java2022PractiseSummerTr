package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q10kontrolIf {
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


        if (secim.length() == 1) {
            if (secim.equals("Y")) {
                System.out.println("YES");

            } else if (secim.equals("N")) {
                System.out.println("No");
            }else System.out.println("gecerli karakter giriniz");

        } else System.out.println("Yalnızca Y ve N giriniz");


    }
}
