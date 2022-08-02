package day3_practice_TAMAMLANDİ;

public class Q05My {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        String isim = "sümeyye";
        String soyIsim = "güler";

        if (isim.length() > soyIsim.length()) {
            System.out.println(isim);
        } else if (isim.length() == soyIsim.length()) {
            System.out.println("isim soyisim uzunlukları eşittir.");
        } else
            System.out.println(soyIsim);
    }
}
