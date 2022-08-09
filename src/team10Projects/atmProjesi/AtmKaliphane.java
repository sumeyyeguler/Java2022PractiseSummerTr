package team10Projects.atmProjesi;

public class AtmKaliphane {

   private String adSoyad, kartNo,sifre;
    private int bakiye;

    public AtmKaliphane() {
    }

    public AtmKaliphane(String adSoyad, String kartNo, String sifre, int bakiye) {
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


    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return " adSoyad='" + adSoyad + '\'' +
                ", kartNo='" + kartNo + '\'' +
                 ", bakiye=" + bakiye +
                '}';
    }
}
