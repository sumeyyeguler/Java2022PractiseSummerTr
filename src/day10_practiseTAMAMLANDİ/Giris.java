package day10_practiseTAMAMLANDİ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
      ogretmenler olusturun ve bilgilerini yazdirin

     */


    //static bir asilzadedir.her yerden ulaşabiliriz, static olarak kullandıgımız degiskenler italik oluyor.
    static Scanner scan = new Scanner(System.in);
    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
    //diamond içine--> data tipi yazılır.
    //oluşturacagın objelerin data tipi öğretmenbilgilerindeki class bilgileridir.

    public static void main(String[] args) {

        //kullanıcıdan aldıgımız bilgileri kalıphanedeki kalıba koymalıyız.
        System.out.println("**** Okulumuza Hoşgeldiniz ****");
        System.out.println("isim : ");
        String isim = scan.nextLine();
        System.out.println("soyisim : ");
        String soyIsim = scan.nextLine();
        System.out.println("yaş : ");
        int yas = scan.nextInt();
        System.out.println("branş : ");
        String brans = scan.next();
        System.out.println("telefon no : ");
        String telefonNo = scan.next();
        //scan.nextLine();//dummy hayalet komut


        OgretmenBilgileri adayOgretmen1 = new OgretmenBilgileri(isim, soyIsim, yas, brans, telefonNo);
        ogretmenList.add(adayOgretmen1);
        System.out.println("ogretmenList = " + ogretmenList);
        //to string oluşturmazsak referans yazdırıyor



    }
}
