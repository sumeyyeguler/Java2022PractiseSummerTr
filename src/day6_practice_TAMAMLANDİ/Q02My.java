package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q02My {
    public static void main(String[] args) {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        int i=0;


        while(i<=sayi){
            if (i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
