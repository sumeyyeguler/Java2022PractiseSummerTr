package team10Projects.FilmTahminNQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {
    static List<String> filmler = new ArrayList<>(Arrays.asList("MUCIZE", "TOSUNPASA", "AYLA", "SEVGININGUCU", "KIBARFEYZO", "VIZONTELE", "BABAMVEOGLUM", "PARDON"));
    static StringBuilder film = new StringBuilder("");

    public static void main(String[] args) {
        filmBul();
    }

    private static void filmBul() {
        Scanner scanner = new Scanner(System.in);
        String tire = "-------------------";
        System.out.println("tahmin edeceğiniz filmin sıra numarasını giriniz ");
        int tahmin = scanner.nextInt();
        String filmHarf = filmler.get(tahmin);
        film.insert(0, tire, 0, filmler.get(tahmin).length());
        System.out.println(film);
        int count = 1;

        while (count <= film.length() * 2) {
            System.out.println("harf giriniz");
            String harf = scanner.next().toUpperCase();
            if (harf.length() == 1) {
                for (int i = 0; i < filmHarf.length(); i++) {
                    if (harf.equals(filmHarf.substring(i, i + 1))) {
                        film = film.replace(i, i + 1, harf);
                    }
                }
                if (filmHarf.equals(film + "")) {
                    System.out.println("****tebrikler kazandınız****");
                    System.out.println(film);
                    System.out.println(count + ". hakkınızda soğru tahmin ettiniz");
                    count = film.length() * 2;
                } else {
                    System.out.println(film);
                    System.out.println("kalan hakkınız :" + (film.length() * 2 - count));
                }

            } else if (filmHarf.equals(harf)) {
                System.out.println(harf);
                System.out.println(count + ". hakkınızda doğru tahmin ettiniz");
                break;
            } else {
                System.out.println("yanlış ");
                break;
            }
            count++;
        }

    }
}