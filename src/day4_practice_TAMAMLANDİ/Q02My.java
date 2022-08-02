package day4_practice_TAMAMLANDİ;

public class Q02My {
    public static void main(String[] args) {
        /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */


        double input=124511;
        donustur(input);

    }

    private static void donustur(double input) {
        double metre=input/100;
        double kMetre=input/1000;
        System.out.println("girilen santimetre değerinin metre hesabı : "+metre+" km hesabı : "+kMetre);
    }
}
