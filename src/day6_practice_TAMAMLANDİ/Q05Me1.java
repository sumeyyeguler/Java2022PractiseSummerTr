package day6_practice_TAMAMLANDİ;

import java.util.Arrays;

public class Q05Me1 {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9};

        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=arr[i]*arr[i];

        }
        System.out.println(Arrays.toString(arr));
    }
}
