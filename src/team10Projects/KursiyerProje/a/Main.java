package team10Projects.KursiyerProje.a;

import team10Projects.KursiyerProje.a.Kursiyer;
import team10Projects.KursiyerProje.a.KursiyerKayit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        KursiyerKayit yeniKayit=new KursiyerKayit();
        List<Kursiyer>kisi=new ArrayList<>();
        boolean cikilsinMİ=false;
        while(!cikilsinMİ){
            System.out.println("işleminizi seçiniz :" +
                    "\n1-KursiyerKsyitAl\n2-KursiyerleriListele" +
                    "\n3-kursiyerUcretleri\n4-ucretsiz kişi\n5-cıkıs");
            int islem=scan.nextInt();
            switch(islem){
                case 1:
                    kisi=yeniKayit.kayitYap();
                    break;
                case 2:
                    yeniKayit.listeYap(kisi);break;
                    case 3:
                        yeniKayit.kursUcreti(kisi);break;
                case 4:
                    yeniKayit.ucretsizKursiyer(kisi);break;
                case 5:
                    cikilsinMİ=true;break;
                default:
                    System.out.println("hatalı giriş yaptınız");
            }

    }
}}
