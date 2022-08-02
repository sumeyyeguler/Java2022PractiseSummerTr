package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q10My {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yes için Y, No için N giriniz : ");
        char secim = scan.next().toUpperCase().charAt(0);

        if (secim == 'Y') {
            System.out.println("YES");
        }else if(secim=='N'){
            System.out.println("NO");
        }else System.out.println("geçerli bir karakter giriniz");

    }
}