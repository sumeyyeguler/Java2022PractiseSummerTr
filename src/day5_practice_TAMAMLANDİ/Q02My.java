package day5_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q02My {
    public static void main(String[] args) {
          /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan = new Scanner(System.in);
        System.out.println("1 den büyük tam sayı giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;
        int i = 1;

    /*
     FOR İLE
        for (int i = 1; i <sayi ; i++) {
            toplam+=i*i;
        }
        System.out.println("kareleri toplamı :"+toplam);

     */

    /*
    WHILE İLE
        while (i<sayi){
           toplam+=i*i;
           i++;
        }
        System.out.println("kareleri toplamı : "+toplam);

     */

        do {
            toplam += i * i;
            i++;

        } while (i < sayi);
        System.out.println("kareleri toplamı : " + toplam);
    }
}
