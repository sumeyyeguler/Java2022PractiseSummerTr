package day5_practice_TAMAMLANDİ;

public class QOMy {
    public static void main(String[] args) {
        	/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

        String input="Seyir Defteri";
        String terstenInput="";

        for (int i =input.length()-1; i >=0 ; i--) {
            terstenInput+=input.substring(i,i+1);
        }
        System.out.println("tersten input : "+terstenInput);
    }
}
