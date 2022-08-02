package day3_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q08_MethodCreationMy {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hesap makinesi işlemi için 2 sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("çarpma için * , bölme için /, toplama için +, çıkarma için - seçiniz");
        char secim = scan.next().charAt(0);
        hesapMakinesi(sayi1, sayi2, secim);
    }

    public static void hesapMakinesi(int sayi1, int sayi2, char secim) {
        if ((secim == '+' || secim == '-' || secim == '/' || secim == '*')) {

            switch (secim) {
                case '+':
                    System.out.println("toplamları : " + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("farkları : " + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("çarpımları : " + sayi1 * sayi2);
                    break;
                case '/':
                    System.out.println("bölümleri : " + sayi1 / sayi2);
                    break;

            }

        } else
            System.out.println("geçerli bir seçim yapınız !!");

    }
}
