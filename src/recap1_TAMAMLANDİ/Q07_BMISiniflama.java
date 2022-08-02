package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q07_BMISiniflama {

    /*
     *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
     *
    BMI = kilo(kg) /(boy*boy)(cm)
    BMI <=20 oldukca zayifsiniz
    20<BMI<=25 Normal sinirlardasiniz
    25<BMI<=30 Sisman kategorisindesiniz
    30<BMI ==> Obez grubundasiniz.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz : ");
        double boy = scan.nextDouble();
        System.out.println("kilonuzu kg olarak giriniz :");
        double kg = scan.nextDouble();

        double Bmi = kg / Math.pow(boy, 2);
        System.out.println("vücut kitle endeksiniz  = " + Bmi);

        if (Bmi > 30) {
            System.out.println("oldukça kilolusunuz!!");
        } else if (Bmi > 25) {
            System.out.println("sisman kategorisinidesiniz!");
        } else if (Bmi > 20) {
            System.out.println("normal değerlerdesiniz");
        } else if (Bmi < 20) {
            System.out.println("oldukça zayıfsınız");
        } else
            System.out.println("geçerli değer giriniz.");

    }}
