package team10Projects.kitapProjesiEncapsulation;

public class Book {
    /*
    encapsulation 2 adımda yapılır
    1- class üyelerini (variable ve methodlar)private yapılmalıyız
    2- (variable ların olduğu classta) public olan getter ve setter lar üretmeliyiz

    getter --> OKUR (değiştiremeyiz) return
    setter --> DEĞİŞTİRİR  void
*/

    private String kitapAdi;
    private String yazarAdi;
    private int kitapFiyati;
    private int kitapNo;

    public Book() {
    }

    public Book(String kitapAdi, String yazarAdi, int kitapFiyati, int kitapNo) {
        //this.kitapAdi = kitapAdi;
        setKitapAdi(kitapAdi);
        // this.yazarAdi = yazarAdi;
        setYazarAdi(yazarAdi);
        //this.kitapFiyati = kitapFiyati;
        setKitapFiyati(kitapFiyati);
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi.substring(0, 1).toUpperCase() + kitapAdi.substring(1);
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi.toUpperCase();
    }

    public int getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(int kitapFiyati) {
        this.kitapFiyati = kitapFiyati * 18;
        //dolardan tl ye çevirdik.
    }

    public int getKitapNo() {
        return kitapNo;
    }

    @Override
    public String toString() {
        return
                kitapNo + "   " +
                        kitapAdi + "   " +
                        yazarAdi + "   " +
                        kitapFiyati
                        + " tl";
    }
}
