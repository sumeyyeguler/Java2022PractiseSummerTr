package team10Projects.KursiyerProje.a;


import java.time.LocalTime;

public class Kursiyer {
   /* Techpro Education Kurs Kaydı

    kullanıcıyı giriş paneli karşılasın
1 - kursiyer kayıt
    isim-soyisim, seçeceği branş(dev,qa,salesforce,cyber security),kayıt zamanı (saat-saniye)
            2 - kursa kaydolanların listesi
3 - fiyatlandırma
4 - ücretsiz kişi (kayıt yapan 5. kişi)
5 - cıkıs*/

    String isim;
     int id;
    String brans;
    LocalTime kayitZamani;
    public Kursiyer(){

    }

    public Kursiyer(String isim, int id, String brans, LocalTime kayitZamani) {
        this.isim = isim;
        this.id = id;
        this.brans = brans;
        this.kayitZamani = kayitZamani;
    }


}
