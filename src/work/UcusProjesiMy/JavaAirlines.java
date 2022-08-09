package work.UcusProjesiMy;

import javax.crypto.Cipher;
import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {

        Yolcu1 sumeyye=new Yolcu1("B",1,28);

        Scanner scan = new Scanner(System.in);
        System.out.println("**** HOŞGELDİNİZ *****");
        System.out.println("B C D rotasından birini seçiniz");
        String city = scan.next().toUpperCase();
        System.out.println("tek yön için 1\nçift yön için 2 seçiniz!");
        int flyType = scan.nextInt();
        System.out.println("yaşınızı giriniz : ");
        int yas = scan.nextInt();
        double priceB = 0.10 * 500;
        double priceC = 0.10 * 700;
        double priceD = 0.10 * 900;


        if (city.equals("B") || city.equals("C") || city.equals("C")) {
            if (city.equals("B")) {
                if (flyType == 1) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + priceB * 0.5 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + priceB * 0.9 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + priceB + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + priceB * 0.7 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                } else if (flyType == 2) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + (priceB * 0.5 * 0.8) * 2 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + (priceB * 0.9 * 0.8) * 2 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + (priceB * 0.8) * 2 + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + (priceB * 0.7 * 0.8) * 2 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                }
            } else if (city.equals("C")) {

                if (flyType == 1) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + priceC * 0.5 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + priceC * 0.9 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + priceC + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + priceC * 0.7 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                } else if (flyType == 2) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + (priceC * 0.5 * 0.8) * 2 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + (priceC * 0.9 * 0.8) * 2 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + (priceC * 0.8) * 2 + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + (priceC * 0.7 * 0.8) * 2 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                }

            } else if (city.equals("D")) {
                if (flyType == 1) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + priceD * 0.5 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + priceD * 0.9 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + priceD + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + priceD * 0.7 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                } else if (flyType == 2) {
                    if (yas < 12 && yas >= 0) {
                        System.out.println("ödenecek ücret : " + (priceD * 0.5 * 0.8) * 2 + " tl'dir");
                    } else if (yas >= 12 && yas <= 24) {
                        System.out.println("ödenecek ücret : " + (priceD * 0.9 * 0.8) * 2 + " tl'dir");
                    } else if (yas > 24 && yas <= 65) {
                        System.out.println("ödenecek ücret : " + (priceD * 0.8) * 2 + " tl'dir");
                    } else if (yas > 65) {
                        System.out.println("ödenecek ücret : " + (priceD * 0.7 * 0.8) * 2 + " tl'dir");
                    } else
                        System.out.println("geçerli seçim yapınız !! ");
                }
            } else
                System.out.println("şehir seçimi hatalıdır.");
        }
    }//MAİN
}//CLASS
