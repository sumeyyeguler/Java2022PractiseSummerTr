package team10Projects.kitapProjesiGrup3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapIslemleri {

    static Scanner scan = new Scanner(System.in);
    static int sayac=1000;//gökteki ay gibidir, değişiklik herkes için olacak
    static List<KitapBilgileri> kitapList=new ArrayList<>();
    //diamond içine--> data tipi yazılır.
    //oluşturacagın objelerin data tipi KitapBilgileri class bilgileridir.

    public static void menu() {//runner classında kullanabilmemiz için static yaptık, main static kulübüne üyedir. menu()'de üye olmak zorundadır.
        System.out.println("**** TEAM10 KÜTÜPHANESİ ****");
        System.out.println("işleminiz seciniz\n1-kitap ekle" +
                "\n2-numara ile kitap görüntüle" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitapları listele" +
                "\n6-cikis");

        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                kitapEkleme();
                menu();break;
            case 2:
                noIleKitapGor();
                menu(); break;
            case 3:
                bilgiIleKitapGor();
                menu(); break;
            case 4:
                noIleKitapSil();
                menu();break;
            case 5:
                kitapListele();
                menu();break;
            case 6:
                cik();break;
            default:
                System.out.println("hatalı giriş yaptınız !! ");
                menu();
                break;
        }
    }

    private static void cik() {
        System.out.println("kitap en iyi arkadaştır");
    }

    private static void kitapListele() {

      for (KitapBilgileri each:kitapList
             ) {
          System.out.println(each.kitapNo+" "+each.kitapAdi+" "+each.yazarAdi+" "+each.kitapFiyati);
        }
    }

    private static void noIleKitapSil() {
        System.out.println("silmek istediğiniz kitabın numarasını yazınız : ");
        int silinecekNo=scan.nextInt();

        for (KitapBilgileri each:kitapList
             ) {
            if (silinecekNo==each.kitapNo){

                System.out.println("sildiğiniz kitap : "+each.kitapNo+" "+each.kitapAdi+" "+each.yazarAdi+" "+each.kitapFiyati);
                kitapList.remove(each);
                break;

            }

        }
    }

    private static void bilgiIleKitapGor() {
        System.out.println("aradığınız kitabın yazar adı yada kitap adını giriniz : ");
        scan.nextLine();
        String bilgi= scan.nextLine().toLowerCase();

        for (KitapBilgileri each:kitapList) {
            if (bilgi.equals(each.kitapAdi)|| bilgi.equals(each.yazarAdi)){
                System.out.println("aradığınız kitap : "+each.kitapNo+" "+each.kitapAdi+" "+each.yazarAdi+" "+each.kitapFiyati);
            }

        }
    }

    private static void noIleKitapGor() {
        System.out.println("Aradığınız kitabın numarasını giriniz : ");
        scan.nextLine();
        int no= scan.nextInt();

        for (KitapBilgileri each:kitapList
             ) {
            if (no==each.kitapNo){
                System.out.println("aradığınız kitap : "+each.kitapNo+" "+each.kitapAdi+" "+each.yazarAdi+" "+each.kitapFiyati);
            }

        }
    }

    private static void kitapEkleme() {
        System.out.println("kitap adı giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String kitapAdi = scan.nextLine();
        System.out.println("yazar adı giriniz : ");
        String yazarAdi = scan.nextLine();
        System.out.println("kitap fiyatı giriniz : ");
        int fiyat = scan.nextInt();
        int kitapNo=++sayac;

        KitapBilgileri kitap1=new KitapBilgileri(kitapAdi,yazarAdi,fiyat,kitapNo);
        kitapList.add(kitap1);

    }
}
