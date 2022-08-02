package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q02_YolHizZaman {


    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sırasıyla mesafe ve hızı giriniz.");
        int mesafe = scan.nextInt(), hiz= scan.nextInt();
      //  System.out.println("yol = " + yol);
      //  System.out.println("zaman = " + zaman);
        System.out.println("mesafe : "+mesafe+" ve hız : "+hiz+" için süre : "+(mesafe/hiz)+" saattir.");

    }

}
