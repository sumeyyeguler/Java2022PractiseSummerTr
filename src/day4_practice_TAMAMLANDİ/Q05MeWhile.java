package day4_practice_TAMAMLANDİ;

public class Q05MeWhile {
    //0 dan 255 e kadar olan sayiların harf değerini yazdırınız

    public static void main(String[] args) {

        int i=0;
        int bitis=255;
        while (i<=bitis){
            System.out.println(i+" sayisinin harf değeri : "+(char)(i));
            i++;
        }
    }
}
