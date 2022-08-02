package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q03My {
    public static void main(String[] args) {

    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("programı durdurmak için x e basın");
        String karakter;


        do {
            karakter = scan.next();
            if (!karakter.equalsIgnoreCase("x")) {
                System.out.println("program çalışıyor");
            }
        } while (!karakter.equalsIgnoreCase("x"));//şart true olursa program bitti diyecek
        System.out.println("program bitti");


    }
}
