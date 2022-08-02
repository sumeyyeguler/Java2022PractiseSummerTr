package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q04me1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0-9 arasında bir rakam giriniz :");
        int sayi = scan.nextInt();
        String sonuc = "";

        if (sayi >= 0 && sayi < 10) {
            if (sayi == 0) {
                System.out.println("sıfır");
            } else if (sayi == 1) {
                System.out.println("bir");
            } else if (sayi == 2) {
                System.out.println("iki");
            } else if (sayi == 3) {
                System.out.println("üç");
            } else if (sayi == 4) {
                System.out.println("dört");
            } else if (sayi == 5) {
                System.out.println("beş");
            } else if (sayi == 6) {
                System.out.println("altı");
            } else if (sayi == 7) {
                System.out.println("yedi");
            } else if (sayi == 8) {
                System.out.println("sekiz");
            } else {
                System.out.println("dokuz");
            }
        } else System.out.println("geçersiz");

        sonuc=sayi==1?"bir":sayi==2?"iki":sayi==3?"üç":sayi==4?"dört":sayi==5?"beş":sayi==6?"altı"
                :sayi==7?"yedi":sayi==8?"sekiz":sayi==9?"dokuz":"geçersiz";
        System.out.println(sonuc);
    }
}

