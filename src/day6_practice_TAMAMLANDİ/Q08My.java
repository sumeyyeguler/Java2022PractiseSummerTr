package day6_practice_TAMAMLANDİ;

import java.util.Arrays;
import java.util.Scanner;

public class Q08My {
    public static void main(String[] args) {
          /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scan=new Scanner(System.in);
        int arr[]=new int[8];
        int count=0;

        for (int i = 0; i <8 ; i++) {
            System.out.println("arrayin "+(i+1)+". elemanını giriniz.");
            arr[i]= scan.nextInt();
            if (arr[i]%3==0){
                count++;
            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
