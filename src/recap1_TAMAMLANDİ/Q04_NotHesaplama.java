package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q04_NotHesaplama {

    /*
     * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sırasıyla vize1, vize2 ve final notunuzu giriniz : ");
        double vize1= scan.nextDouble(),vize2= scan.nextDouble(),finalNot=scan.nextDouble(), gecmeNotu;

        gecmeNotu=(((vize1+vize2)/2)*0.3)+(finalNot*0.7);
        System.out.println("gecmeNotu = " + gecmeNotu);

        String harfKarsiligi=gecmeNotu<45 ? "ff":gecmeNotu<60 ?"dd":gecmeNotu<70?"cc":gecmeNotu<85?"bb":"aa";
        System.out.println("harfKarsiligi = " + harfKarsiligi);
    }
}