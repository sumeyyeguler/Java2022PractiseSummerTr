package day6_practice_TAMAMLANDİ;

import java.util.Arrays;

public class Q06My {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str="HeySiri";
        str=str.replace("Hey","Bye");

        String []yeniStr=new String[1];
        yeniStr[0]=str;
        System.out.println(Arrays.toString(yeniStr));
    }
}
