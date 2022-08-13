
package team10Projects.proje;
public class Atm {
    private String adSoyad;
    private String sifre;
    private String kartNo;
    private double bakiye;
    public Atm(String adSoyad, String sifre, String kartNo, double bakiye) {
        this.adSoyad = adSoyad;
        this.sifre = sifre;
        //this.kartNo = kartNo;
        setKartNo(kartNo);
        this.bakiye = bakiye;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public String getKartNo() {
        return kartNo;
    }
    public void setKartNo(String kartNo) {
        this.kartNo = kartNo.replaceAll("\\s","");//burada kart numarasındaki boşlukları kaldırdık.
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public Atm() {
    }
}
