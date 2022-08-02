package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q11My {
    public static void main(String[] args) {
            /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz :");
        double not = scan.nextDouble();

        if (not >= 90 && not <= 100) {
            System.out.println("notunuz A");
        } else if (not >= 80 && not <= 89) {

            System.out.println("notunuz B");
        } else if (not >= 70 && not <= 79) {
            System.out.println("notunuz C");
        } else if (not >= 60 && not <= 69) {
            System.out.println("notunuz D");
        } else if (not >= 0 && not <= 59) {
            System.out.println("notunuz F");
        } else
            System.out.println("geçerli bir not giriniz");
    }
}