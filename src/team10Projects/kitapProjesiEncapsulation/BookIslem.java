package team10Projects.kitapProjesiEncapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookIslem {

    static Scanner scan = new Scanner(System.in); //tüm methodlardan ulaşabilmek için, class seviyesinde ve static olmalıdır.
    static int sayac2 = 1000; //static yapıyoruz çünkü her seferinde sayac güncellenecek
    static List<Book> kitapListesi = new ArrayList<>();
    //diamond içine--> data tipi yazılır.
    //oluşturacagın objelerin data tipi Book class bilgileridir, yani burada data tipimiz Book classı olmuş oluyor.


    public static void menu2() {
            /*
        eğer Scanner objesi static olmazsa, obje oluşturarak ulaşmamız gerekir
        BookIslem obj2=new BookIslem();
        int islem=obj2.scan.nextInt();
         */

        Scanner scanner = new Scanner(System.in);//code da hata aldığımız için ekledik

        System.out.println("**** TEAM10 KÜTÜPHANESİ ****");
        System.out.println("işleminiz seciniz\n1-kitap ekle" +
                "\n2-numara ile kitap görüntüle" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitapları listele" +
                "\n6-cikis");


        try { //Kullanıcıdan String ifade gelme ihtimaline karşı try/catch ile önlem alıyoruz
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    kitapEk();
                    menu2();
                    break;
                case 2:
                    noIleAra();
                    menu2();
                    break;
                case 3:
                    bilgiIleAra();
                    menu2();
                    break;
                case 4:
                    noIleSil();
                    menu2();
                    break;
                case 5:
                    Listele();
                    menu2();
                    break;
                case 6:
                    cikis1();
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız !! ");
                    menu2();
                    break;
            }
        } catch (Exception e) {
            System.out.println("lütfen rakam giriniz ! ");
            menu2();
        }
    }

    private static void kitapEk() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("kitap adı giriniz : ");
        String kitapAdi = scan1.nextLine();
        System.out.println("yazar adı giriniz : ");
        String yazarAdi = scan1.nextLine();
        System.out.println("kitap fiyatı giriniz : ");
        int fiyat = 0;

        try {
            fiyat = scan1.nextInt();
        } catch (Exception e) {
            System.out.println("sadece sayı giriniz ! ");
            kitapListesi.remove(kitapListesi.size());
            kitapEk();
        }
        int id = ++sayac2;

        Book kitap = new Book(kitapAdi, yazarAdi, fiyat, id);
        kitapListesi.add(kitap);

    }

    private static void noIleAra() {
        Scanner scan2 = new Scanner(System.in);

        System.out.println("aradığınız kitabın numarasını giriniz : ");
        try {
            int no = scan2.nextInt();
            if (no <= 1000 || no > 1000 + kitapListesi.size()) {
                System.out.println("kitap numarası kürtüphanede bulunmamaktadır.");
            } else {

                for (Book each : kitapListesi
                ) {
                    if (no == each.getKitapNo()) {
                        System.out.println("aradığınız kitap : " + each);
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("sadece sayı giriniz !");
            noIleAra();
        }

    }

    private static void bilgiIleAra() {
        System.out.println("kitap adı veya yazar adını giriniz : ");
        String bilgi = scan.nextLine();

        for (Book each : kitapListesi
        ) {
            if (bilgi.equalsIgnoreCase(each.getKitapAdi()) || bilgi.equalsIgnoreCase(each.getYazarAdi())) {
                System.out.println("aradığınız kitap : " + each);
            }
        }

    }

    private static void noIleSil() {
        boolean cikilsinMi = false;

        while (!cikilsinMi) {//method içinde method kullanmadan da (yani menu() methodunu eklemedende) while döngüsü ile yapabiliriz.
            Scanner scanner = new Scanner(System.in);
            System.out.println("sileceğiniz kitabın numarasını giriniz :");
            try {
                int no = scanner.nextInt();
                for (Book each : kitapListesi
                ) {
                    if (no == each.getKitapNo()) {
                        System.out.println("silinen kitap : " + each);
                        kitapListesi.remove(each);
                        break;

                    }

                }
                cikilsinMi = true;

            } catch (Exception e) {
                System.out.println("sadece sayi giriniz !");
                noIleSil();
            }

        }
    }

    private static void Listele() {
        for (Book each : kitapListesi
        ) {
            System.out.println(each);
        }
    }

    private static void cikis1() {
        System.out.println("*** iyi günler ***");
    }

}


