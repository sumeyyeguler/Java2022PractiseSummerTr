package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q01My {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner scan = new Scanner(System.in);
        System.out.println("tam sayi giriniz");
        int sayi = scan.nextInt();
        int basamakToplam=0;


        while (sayi!=0){
            basamakToplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("basamak toplamı : "+basamakToplam);

    }
}
