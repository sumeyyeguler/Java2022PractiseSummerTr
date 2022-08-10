package team10Projects.ucusProjesiGrup3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;

public class Yolcu {

    private String isimSoyisim,sehir,flightNo,kapiNo,biletTuru; //flightNo ve kapiNo concat yapabilmek için string aldık
    private int yas;

    public Yolcu() {
    }

    public Yolcu(String isimSoyisim, String sehir, String biletTuru, int yas) {
        this.isimSoyisim = isimSoyisim;
        this.sehir = sehir;
        this.biletTuru = biletTuru;
        this.yas = yas;
        setFlightNo();
        setKapiNo();
    }

    public String getIsimSoyisim() {//kullanmadığımız için bu methodu silebiliriz
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {//kullanmadığımız için bu methodu silebiliriz
        this.isimSoyisim = isimSoyisim;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {//kullanmadığımız için bu methodu silebiliriz
        this.sehir = sehir;
    }

    public String getFlightNo() {//kullanmadığımız için bu methodu silebiliriz
        return flightNo;
    }

    public void setFlightNo() {
        this.flightNo = ""+ LocalDate.now().getYear()+ LocalTime.now().getHour();
    }

    public String getKapiNo() {//kullanmadığımız için bu methodu silebiliriz
        return kapiNo;
    }

    public void setKapiNo() {
        Random rnd=new Random();
        this.kapiNo =sehir+rnd.nextInt(10);
    }

    public String getBiletTuru() {
        return biletTuru;
    }

    public void setBiletTuru(String biletTuru) {//kullanmadığımız için bu methodu silebiliriz
        this.biletTuru = biletTuru;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "\nisimSoyisim=" + isimSoyisim +
                "\nsehir=" + sehir +
                "\nflightNo=" + flightNo +
                "\nkapiNo=" + kapiNo +
                "\nbiletTuru=" + biletTuru +
                "\nyas=" + yas;
    }
}
