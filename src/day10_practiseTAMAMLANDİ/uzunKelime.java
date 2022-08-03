package day10_practiseTAMAMLANDİ;

import java.util.Scanner;

public class uzunKelime {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        System.out.println("cümle giriniz : ");
        String cumle= scan.nextLine();
        System.out.println(enUzunKelime1(cumle));
    }

    //  cumle=java çok çalışana kolaydır.

    public static String enUzunKelime1(String cumle) {
        //array tipinde bir soru varsa split+fori/foreach

        String arr[]=cumle.split(" ");//String bir ifadeyi arraye çevirmek için split methodu kullanabiliriz.

        int max=0;
        String enUzunKelime="";

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>max){
                max=arr[i].length();
                enUzunKelime=arr[i];
            }

        }return enUzunKelime;
    }
}
