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
       setIsimSoyisim(isimSoyisim);
       setSehir(sehir);
        this.biletTuru = biletTuru;
        this.yas = yas;
        setFlightNo();
        setKapiNo();
    }

    public String getIsimSoyisim() {//kullanmadığımız için bu methodu silebiliriz
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {//kullanmadığımız için bu methodu silebiliriz
        this.isimSoyisim = isimSoyisim.toUpperCase();
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {//kullanmadığımız için bu methodu silebiliriz
        this.sehir = sehir.toUpperCase();
    }

    public String getFlightNo() {//kullanmadığımız için bu methodu silebiliriz
        return flightNo;
    }//kullanmadığımız için bu methodu silebiliriz

    public void setFlightNo() {
        this.flightNo = ""+ LocalDate.now().getYear()+ LocalTime.now().getHour();
    }

    public String getKapiNo() {//kullanmadığımız için bu methodu silebiliriz
        return kapiNo;
    }//kullanmadığımız için bu methodu silebiliriz

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
                "\nİsim Soyisim   :" + isimSoyisim +
                "\nYaş            :" + yas+
                "\nSehir          :" + sehir +
                "\nFlight Number  :" + flightNo +
                "\nGate Number    :" + kapiNo +
                "\nBilet Türü     :" + biletTuru ;
    }
}
