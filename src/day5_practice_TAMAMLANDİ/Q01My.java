package day5_practice_TAMAMLANDİ;

import java.util.Scanner;

public class Q01My {
    public static void main(String[] args) {
         /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

        String sesliHarf = "aeiou";
        String sessizHarf = "wrtypdsfghjklzxcvbnmq";
        Scanner scan = new Scanner(System.in);
        System.out.println("karakter giriniz : ");
        String harf = scan.next().toLowerCase();

        if (harf.length() == 1) {

            for (int i = 0; i < 1; i++) {
                if (sesliHarf.contains(harf)) {
                    System.out.println("sesli harftir");
                } else if (sessizHarf.contains(harf)) {
                    System.out.println("sessiz harftir.");
                } else
                    System.out.println("karakterdir");
            }
        } else
            System.out.println("tek karakter giriniz");
    }
}
