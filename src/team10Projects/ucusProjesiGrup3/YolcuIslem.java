package team10Projects.ucusProjesiGrup3;

import java.util.Arrays;
import java.util.List;

public class YolcuIslem {


    public static void yolcu() {

        Yolcu yolcu1 = new Yolcu("ahmet", "d", "G-D", 23);

        double biletUceti = hesapla(yolcu1.getYas(), yolcu1.getSehir(), yolcu1.getBiletTuru());

        System.out.println("bilet ücreti : " + biletUceti);
        System.out.println(yolcu1);
        System.out.println("*** TEAM10 AIRLINES ***");
    }

    private static double hesapla(int yas, String varilacakSehir, String biletTuru) {//varilacaksehir yolcu constructorından geliyor.
        List<String> sehirler = Arrays.asList("B", "C", "D");
        int[] fiyatlar = {50, 70, 90};
        double price = 0;

        //("ahmet", "D", "G-D", 23);
        for (int i = 0; i < sehirler.size(); i++) {
            if (varilacakSehir.equalsIgnoreCase(sehirler.get(i))) {
                if (yas < 12) {
                    price = fiyatlar[i] * 0.5;
                    System.out.println("yas indiriminden faydalanılmıştır.");
                } else if (yas <= 24) {
                    price = fiyatlar[i] * 0.9;
                    System.out.println("yas indiriminden faydalanılmıştır.");
                } else if (yas >= 65) {
                    price = fiyatlar[i] * 0.7;
                    System.out.println("yas indiriminden faydalanılmıştır.");
                } else //24-65 yaş arası
                    price = fiyatlar[i];
            }
        }
        if (biletTuru.equalsIgnoreCase("G-D")) {
            price = price * 2 * 0.8;
            System.out.println("gidiş dönüş indiriminden faydalanılmıştır.");
        } else if (yas > 24 && yas < 65) {
            System.out.println("indirimsiz yolcu");
        }
        return price;
    }

}










 /*for (int i = 0; i <sehirler.size() ; i++) {//şehirleri dolaşıyor
            for (int j = i; j <i+1 ; j++) {//fiyatları dolaşıyor
                if (varilacakSehir.equals(sehirler.get(i))){
                    if (yas<12){
                        price=fiyatlar[j]*0.5;
                        System.out.println("yas indiriminden faydalanılmıştır.");
                    }else if (yas<=24){
                        price=fiyatlar[j]*0.9;
                        System.out.println("yas indiriminden faydalanılmıştır.");
                    }else if (yas>=65){
                        price=fiyatlar[j]*0.7;
                        System.out.println("yas indiriminden faydalanılmıştır.");
                    }else //24-65 yaş arası
                       price=fiyatlar[j];
                   // System.out.println("indirimsiz müşteri"); gidiş dönüş indirimindende yararlanma ihtimali olduğu için sildik.
                }

            */