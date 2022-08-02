package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q05_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isim soyisim giriniz : ");
        String isim = scan.nextLine().toUpperCase();
        buyukHarfYazdir(isim);


    }

    private static void buyukHarfYazdir(String isim) {
        System.out.println("isim = " + isim);

        System.out.println(isim.length());
        System.out.println(isim.charAt(3));
        System.out.println(isim.replace('E', 'R'));//BÜTÜN E LER YERİNE R
        System.out.println(isim.replaceAll("s","*"));
        System.out.println(isim.substring(5));
        System.out.println(isim.endsWith("R"));
        System.out.println(isim.isEmpty());
        System.out.println(isim.toString());
        System.out.println(isim.startsWith("S"));
        System.out.println(isim.lines());
    }
}
