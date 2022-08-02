package day3_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    String input=scan.nextLine();
        System.out.println("boşluk varmı : "+ input.contains(" "));
        System.out.println("boşMu : "+input.isEmpty());



}}
