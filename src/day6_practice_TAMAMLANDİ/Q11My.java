package day6_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q11My {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        String pin = "";
        String olmasiGerekenPin = "Sumeyye1122.";
        int girisHakki = 4;

        sifre(pin, olmasiGerekenPin, girisHakki);
    }

    public static void sifre(String pin, String olmasiGerekenPin, int girisHakki) {

        while(true){
            System.out.println("pin kodunuzu giriniz : ");
             pin = scan.next();
            if (pin.equals(olmasiGerekenPin)) {
                System.out.println("giriş başarılı !");break; //break eklemediğimizde döngü devam ediyor
            } else
                System.out.println("giriş başarısız !");
            girisHakki--;
            System.out.println("kalan giris hakkiniz : " + girisHakki);
            if (girisHakki==0){
                System.out.println("hesabınız bloke olmuştur.");break;//eklemediğimizde döngü - sayılara dogru deevam ediyor
            }
        }
    }
}