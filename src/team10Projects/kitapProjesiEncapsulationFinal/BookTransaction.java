package team10Projects.kitapProjesiEncapsulationFinal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTransaction {
    static List<Book> bookList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int count = 1000;

    public static void bookMenu() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("*******team10 kütüphanesi*********");
        System.out.println("işleminiz seciniz\n1-kitap ekle" +
                "\n2-numara ile kitap görüntüle" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitapları listele" +
                "\n6-cikis");
        int islem = 0;
        try {

            islem = scan2.nextInt();
        } catch (Exception e) {
            System.out.println("sadece sayı giriniz");
            bookMenu();
        }
        switch (islem) {
            case 1:
                kitapEkle();
                bookMenu();
                break;
            case 2:
                numaraIleKitapGoruntule();
                bookMenu();
                break;
            case 3:
                bilgiIleKitapGoruntule();
                bookMenu();
                break;
            case 4:
                kitapSil();
                bookMenu();
                break;
            case 5:
                listeYap();
                bookMenu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("böyle bir tercih olamaz yeniden deneyin");
                bookMenu();
                break;
        }

    }

    private static void cikis() {
        System.out.println("bir çay doldur" +
                "\nbir kitap seç\n" +
                "ve dünyayi sessize al  :)");
    }

    private static void listeYap() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    private static void kitapSil() {
        int silNo = 0;
        boolean cikMi = false;
        while (!cikMi) {

            Scanner scan3 = new Scanner(System.in);
            System.out.println("silmek istediğiniz kitabın numarasını giriniz :");

            try {
                silNo = scan3.nextInt();

                if (silNo > 1000 && silNo <= 1000 + bookList.size()) {
                    cikMi = true;
                } else {

                    System.out.println("listemizde " + silNo + " numarada kitap zaten yok");
                }
            } catch (Exception e) {
                System.out.println("sadece sayi giriniz");

            }
        }

        for (Book b : bookList) {
            if (silNo == b.getId()) {
                bookList.remove(b);
                System.out.println(b.getId() + " nolu kitap listeden çıkarılmıştır");
                break;
            }
        }

    }

    private static void bilgiIleKitapGoruntule() {
        System.out.println("aradığınız kitabın adını veya yazarın adını yazınız");
        String bilgi = scan.nextLine();
        boolean flag = true;
        for (Book c : bookList) {
            if (bilgi.equals(c.getKitapAdi()) || bilgi.equalsIgnoreCase(c.getYazarAdi())) {
                System.out.println("aradığınız kitap : " + c);
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("aradğınız " + bilgi + " adlı  kitap/yazar bilgisi listede yoktur");
        }
    }

    private static void numaraIleKitapGoruntule() {
        int numara = 0;
        boolean flag = false;
        Scanner scan4 = new Scanner(System.in);
        try {
            System.out.println("aradığınız kitabın numarasını giriniz :");
            numara = scan4.nextInt();
            flag = true;
        } catch (Exception e) {
            System.out.println("sadece sayi giriniz");
            numaraIleKitapGoruntule();
        }
        if (flag) {
            boolean flag2=true;
                for (Book d : bookList) {
                    if (d.getId() == numara) {
                        System.out.println("aradığınız kitap : " + d );
                 flag2=false;
                    }
                }if(flag2)
                System.out.println(numara + " numaralı kitap kütüphanemizde yoktur");
            }
        }

    private static void kitapEkle() {

        int kitapFiyat = 0;
        System.out.println("kitap adını giriniz");
        String kitapAd = scan.nextLine();
        System.out.println("yazar adı giriniz");
        String yazarAd = scan.nextLine();

        boolean flag = true;
        while (flag) {
            System.out.println("kitap fiyatini giriniz");
            Scanner sc = new Scanner(System.in);


            try {
                kitapFiyat = sc.nextInt();
                flag = false;

            } catch (Exception e) {
                System.out.println("kitap fiyatını sayı olatak giriniz");

            }
        }


            int kitapId = ++count;
            Book kit = new Book(kitapAd, yazarAd, kitapId, kitapFiyat);
            bookList.add(kit);



    }


}