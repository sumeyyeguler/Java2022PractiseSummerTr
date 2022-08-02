package day4_practice_TAMAMLANDİ;

public class Q05MeDoWhile {
    //0 dan 255 e kadar olan sayıların harf değeriniz yazdırın

    public static void main(String[] args) {

        int i=0;
        int bitis=255;
        do {
            System.out.println(i+" sayısının harf değeri : "+(char)(i));
            i++;
        }while (i<=bitis);
    }
}
