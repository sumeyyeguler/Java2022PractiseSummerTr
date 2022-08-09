package team10Projects.kitapProjesiNQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapIslemleri {

    static List<KitapBilgileri> kitapList = new ArrayList<KitapBilgileri>();

    static Scanner scan = new Scanner(System.in);
    static int sayac = 1000;

    public static void menu() {
        System.out.println("*******team10 kütüphanesi*********");
        System.out.println("işleminiz seciniz\n1-kitap ekle" +
                "\n2-numara ile kitap görüntüle" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitapları listele" +
                "\n6-cikis");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                kitapEkle();
                menu();
                break;
            case 2:
                noIleKitapGoruntule();
                menu();
                break;
            case 3:
                bilgiIleKitapGoruntule();
                menu();
                break;
            case 4:
                numaraIleKitapSil();
                menu();
                break;
            case 5:
                listelee();
                menu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("böyle bir tercih olamaz yeniden deneyin");
                menu();
                break;
        }
    }

    private static void listelee() {
        for (KitapBilgileri a : kitapList) {
            System.out.println(a.id + "  " + a.kitapAdi + "   " + a.yazarAdi + "  " + a.kitapFiyati + "€");
        }
    }

    private static void cikis() {
        System.out.println("bir çay doldur\nbir kitap seç\nve dünyayi sessize al  :)");
    }

    private static void numaraIleKitapSil() {
        System.out.println("silinecek kitabın numarasını giriniz");
        int silNo = scan.nextInt();

        for (KitapBilgileri b : kitapList) {
            if (silNo == b.id) {
                kitapList.remove(b);
                System.out.println(b.id + " nolu kitap listeden çıkarılmıştır");
                break;
            }
        }
    }

    private static void bilgiIleKitapGoruntule() {
        System.out.println("aradığınız kitabın adını veya yazarın adını yazınız");
        scan.nextLine();
        String bilgi = scan.nextLine();

        for (KitapBilgileri c : kitapList) {
            if (bilgi.equals(c.kitapAdi) || bilgi.equals(c.yazarAdi)) {
                System.out.println("aradığınız kitap :" + c.id + "  " + c.kitapAdi + "  " + c.yazarAdi + "  " + c.kitapFiyati);
            }

        }
    }

    private static void noIleKitapGoruntule() {
        System.out.println("aradığınız kitabın numarasını giriniz :");
        int numara = scan.nextInt();
        for (KitapBilgileri d : kitapList) {
            if (d.id == numara) {
                System.out.println("aradığınız kitap :" + d.id + "  " + d.kitapAdi + "  " + d.yazarAdi + "  " + d.kitapFiyati);
            }
        }
    }

    public static void kitapEkle() {
        System.out.println("kitap adını giriniz");
        scan.nextLine();
        String kitapAd = scan.nextLine();
        System.out.println("yazar adı giriniz");
        String yazarAd = scan.nextLine();
        System.out.println("kitap fiyatini giriniz");
        int kitapFiyat = scan.nextInt();
        int kitapId = ++sayac;
        KitapBilgileri kit = new KitapBilgileri(kitapAd, yazarAd, kitapId, kitapFiyat);
        kitapList.add(kit);
    }

}
