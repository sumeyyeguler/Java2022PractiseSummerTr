package team10Projects.ucusProjesiTFNS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class UcakKalipp {
    private String adiSoyadi, gidilecekYer, gidisDonus, fligtNum, gateNum;
    private int yas;
    private double kmucret = 0.10;
    private double ucret, yasIndirimi, gidisDonusInd;

    public UcakKalipp() {
    }

    public UcakKalipp(String adiSoyadi, String gidilecekYer, String gidisDonus, int yas) {
        this.adiSoyadi = adiSoyadi;
        this.gidilecekYer = gidilecekYer;
        this.gidisDonus = gidisDonus;
        this.yas = yas;
        setGateNum(gidilecekYer);
        setFligtNum();
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getGidilecekYer() {
        return gidilecekYer;
    }

    public void setGidilecekYer(String gidilecekYer) {
        this.gidilecekYer = gidilecekYer;
    }

    public String getGidisDonus() {
        return gidisDonus;
    }

    public void setGidisDonus(String gidisDonus) {
        this.gidisDonus = gidisDonus;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKmucret() {
        return kmucret;
    }

    public void setKmucret(double kmucret) {
        this.kmucret = kmucret;
    }

    public double getYasIndirimi() {
        return yasIndirimi;
    }

    public void setYasIndirimi(double yasIndirimi) {
        this.yasIndirimi = yasIndirimi;
    }

    public double getGidisDonusInd() {
        return gidisDonusInd;
    }

    public void setGidisDonusInd(double gidisDonusInd) {
        this.gidisDonusInd = gidisDonusInd;
    }

    public String getFligtNum() {
        return fligtNum;
    }

    public void setFligtNum() {
        this.fligtNum = "" + LocalDate.now().getYear() + LocalTime.now().getHour();
    }

    public String getGateNum() {
        return gateNum;
    }

    public void setGateNum(String gateNum) {
        Random random = new Random();
        this.gateNum = "" + gidilecekYer + random.nextInt(10);
    }

    @Override
    public String toString() {
        return "\n" +
                "\nadiSoyadi= " + adiSoyadi +
                "\ngidilecekYer= " + gidilecekYer +
                "\ngidisDonus= " + gidisDonus +
                "\nyas= " + yas +
                "\nucret= " + ucret +
                "\nyasIndirimi= " + yasIndirimi +
                "\ngidisDonusInd= " + gidisDonusInd +
                "\nflightNum= " + fligtNum +
                "\ngateNum= " + gateNum;
    }
}