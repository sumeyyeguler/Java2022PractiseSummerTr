package team10Projects.ucusProjesiTFNS;

import java.util.ArrayList;
import java.util.List;

public class UcakIslemm {


    UcakKalipp yolcu1 = new UcakKalipp("Fatma Cimen", "B", "GD", 10);
    UcakKalipp yolcu2 = new UcakKalipp("Sumeyye Guler", "C", "G", 5);
    UcakKalipp yolcu3 = new UcakKalipp("Tulay Palta", "D", "G", 70);
    UcakKalipp yolcu4 = new UcakKalipp("Nurettin Guzel", "B", "GD", 25);
    List<UcakKalipp> yolcuListesi = new ArrayList<>();

    public void ucretHesapla() {
        yolcuListesi.add(yolcu1);
        yolcuListesi.add(yolcu2);
        yolcuListesi.add(yolcu3);
        double indirimYas = 0;
        double indirimYon = 0;




        for (UcakKalipp each : yolcuListesi) {
            if (each.getYas() < 12) {
              indirimYas = each.getUcret() * 0.5;
                each.setYasIndirimi(indirimYas);
            } else if (each.getYas() >= 12 && (each.getYas() <= 24)) {
                indirimYas = each.getUcret() * 0.1;
                each.setYasIndirimi(indirimYas);
            } else if (each.getYas() > 65) {
                indirimYas = each.getUcret() * 0.3;
                each.setYasIndirimi(indirimYas);
            }
            each.setUcret(each.getUcret() - indirimYas);
            if (each.getGidisDonus().equals("GD")) {
                indirimYon = (each.getUcret() - indirimYas) * 0.2 * 2;
                each.setGidisDonusInd(indirimYon);
                each.setUcret((each.getUcret() - indirimYas - indirimYon / 2) * 2);
            }
            System.out.println(each);
            indirimYas = 0;
            indirimYon = 0;
        }

    }
}
