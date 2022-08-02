package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q01elif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen 5 basamakli sayi giriniz :");
        int num = scan.nextInt();
        int ilkIki = num / 1000;
        int sonIki = num % 100; //100 e bolumunden kalani verir
        int ilkIkiTop = (ilkIki / 10) + (ilkIki % 10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki / 10) + (sonIki % 10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop + sonIkiTop));
    }
}