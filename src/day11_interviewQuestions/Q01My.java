package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01My {
    public static void main(String[] args) {
            /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
            hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("string giriniz : ");
        String str= scan.nextLine().toLowerCase();
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("array sor ve split hali : "+Arrays.toString(arr));
        int count=0;

        for (int i = 1; i <arr.length ; i++) {//45.dk dinle
            if (arr[i-1].equals(arr[i])){
                count++;
            }else
                System.out.println(arr[i-1]+" karakteri "+count);
            count=0;

        }
    }
}
