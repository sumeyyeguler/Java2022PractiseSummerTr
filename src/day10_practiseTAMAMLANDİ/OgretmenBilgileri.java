package day10_practiseTAMAMLANDİ;

public class OgretmenBilgileri {
   /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin
    gerekli
      bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance
     variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */

    String isim;
    String soyIsim;
    int yas;
    String brans;
    String telefonNumarasi;

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                ", brans='" + brans + '\'' +
                ", telefonNumarasi='" + telefonNumarasi + '\'' +
                '}';
    }

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String telefonNumarasi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.telefonNumarasi = telefonNumarasi;

    }
}
