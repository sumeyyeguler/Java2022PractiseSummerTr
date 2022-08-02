package day3_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q01My {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner (System.in);
        System.out.println("kelime giriniz : ");
        String kelime1=scan.nextLine().toLowerCase();
        String kelime2=scan.nextLine().toLowerCase();
        String kelime3=scan.nextLine().toLowerCase();
        String kelime4=scan.nextLine().toLowerCase();

        System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "+kelime2+" "+kelime3+" "+kelime4);
    }
}
