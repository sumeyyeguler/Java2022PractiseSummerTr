package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q04My {
    public static void main(String[] args) {
             /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:    You entered wrong word.
		     */

        Scanner scan = new Scanner(System.in);
        String kelime = "";

        do {
            kelime = scan.next();
            if (kelime.length() <= 2) {
                System.out.println("girilen kelime 3 karakterden az olamaz.");

            } else if (kelime.length() >= 3 && kelime.length() % 2 == 1) {
                System.out.println(kelime.charAt(kelime.length() / 2));
            } else
                System.out.println("You entered wrong word.");


        } while (!(kelime.length() >= 3 && kelime.length() % 2 == 1));
    }
}