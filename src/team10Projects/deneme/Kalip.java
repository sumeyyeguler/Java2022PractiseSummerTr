package team10Projects.deneme;

public class Kalip {
    private String adSoyad, kartNo, sifre, iban;

    private int bakiye;

    public Kalip() {
    }

    public Kalip(String adSoyad, String kartNo, String sifre, int bakiye) {
        this.adSoyad = adSoyad;
        this.kartNo = kartNo;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}