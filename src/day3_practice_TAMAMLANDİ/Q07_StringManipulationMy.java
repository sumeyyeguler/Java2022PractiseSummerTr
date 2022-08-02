package day3_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q07_StringManipulationMy {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.next();

        String yeniK = kelime.substring(3) + kelime.charAt(2) + kelime.charAt(1) + kelime.charAt(0);
        System.out.println(yeniK);

        //for ile

        String tersi = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersi += kelime.charAt(i) + "";
        }
        System.out.println(tersi);


        }
    }
