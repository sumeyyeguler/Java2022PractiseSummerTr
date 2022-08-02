package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("isim  : ");
        String isim= scan.nextLine();
        System.out.println("soyisim : ");
        String soyIsim= scan.nextLine();
        System.out.println(isim.concat(soyIsim));

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        System.out.println(isim.substring(1).concat(soyIsim.substring(1)));

    }
}
