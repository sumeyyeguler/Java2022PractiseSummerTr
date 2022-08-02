package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q03me {
    public static void main(String[] args) {
        //   1)Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.


        okunusYazdir();


    }//main sonu

    private static void okunusYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz :");
        int sayi = scan.nextInt();

        int birlerBas = sayi % 10, onlarBas = (sayi / 10) % 10, yuzlerBas = sayi / 100;//sayi int old için 100 ebölünce direk birler bas bulunacak

        if (sayi > 99 && sayi < 1000) {


            switch (yuzlerBas) {
                case 1:
                    System.out.print("yüz");
                    break;
                case 2:
                    System.out.print("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("beşyüz");
                    break;
                case 6:
                    System.out.print("altıyüz");
                    break;
                case 7:
                    System.out.println("yediyüz");
                    break;
                case 8:
                    System.out.println("sekizyüz");
                    break;
                case 9:
                    System.out.println("dokuzyüz");
                    break;
            }
            switch (onlarBas) {
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.print("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }
            switch (birlerBas) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }else System.out.println("3 basamaklı olmalıdır");
    }
}//class sonu
