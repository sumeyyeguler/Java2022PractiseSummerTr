package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q05_Scanner {


    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333

        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 adet tam sayi giriniz :");
        double sayi1 = scan.nextDouble(), sayi2 = scan.nextDouble(), sayi3 = scan.nextDouble();

        double sonuc = (Math.pow(sayi1, 2) - Math.pow(sayi2, 2)) / (sayi3 * 3);
        System.out.println("sonuc = " + sonuc);

    }


}
