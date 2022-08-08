package team10Projects.ucusProjesi;

public class UcusKaliphane {

   private String adSoyAd,gidilecekYer;
   private int yas;
   private double kmFiyat,ucret=0.10;
   private boolean gidisDonus;

    public UcusKaliphane() {
    }

    public UcusKaliphane(String adSoyAd, String gidilecekYer, int yas, boolean gidisDonus) {
        this.adSoyAd = adSoyAd;
        this.gidilecekYer = gidilecekYer;
        this.yas = yas;
        this.gidisDonus = gidisDonus;
    }

    public String getAdSoyAd() {
        return adSoyAd;
    }

    public void setAdSoyAd(String adSoyAd) {
        this.adSoyAd = adSoyAd;
    }

    public String getGidilecekYer() {
        return gidilecekYer;
    }

    public void setGidilecekYer(String gidilecekYer) {
        this.gidilecekYer = gidilecekYer;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKmFiyat() {
        return kmFiyat;
    }

    public void setKmFiyat(double kmFiyat) {
        this.kmFiyat = kmFiyat;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public boolean isGidisDonus() {
        return gidisDonus;
    }

    public void setGidisDonus(boolean gidisDonus) {
        this.gidisDonus = gidisDonus;
    }

    @Override
    public String toString() {
        return "UcusKaliphane{" +
                "adSoyAd='" + adSoyAd + '\'' +
                ", gidilecekYer='" + gidilecekYer + '\'' +
                ", yas=" + yas +
                ", kmFiyat=" + kmFiyat +
                ", ucret=" + ucret +
                ", gidisDonus=" + gidisDonus +
                '}';
    }
}//class sonu
