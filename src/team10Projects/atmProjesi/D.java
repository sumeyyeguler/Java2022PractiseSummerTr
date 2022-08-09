package team10Projects.atmProjesi;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("para göndermek istediğiniz iban ı giriniz : ");
        String iban = scan.next();
        int gonderilecekUcret = 0;

        if (iban.startsWith("TR") && iban.length() == 4) {
            System.out.println("göndermek istediğiniz ucreti giriniz :");
            gonderilecekUcret = scan.nextInt();
        } else {
            System.out.println("iban yanlış");
        }
    }
}
