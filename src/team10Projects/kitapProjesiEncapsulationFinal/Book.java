package team10Projects.kitapProjesiEncapsulationFinal;

public class Book {
    private String kitapAdi;
    private String yazarAdi;
    private int id;
    private int kitapFiyati;

    public Book() {
    }

    public Book(String kitapAdi, String yazarAdi, int id, int kitapFiyati) {
        this.kitapAdi = kitapAdi;
        setYazarAdi(yazarAdi);
        //  this.yazarAdi = yazarAdi;
        this.id = id;
        //this.kitapFiyati = kitapFiyati;
        setKitapFiyati(kitapFiyati);
    }

    public String getKitapAdi() {
        return kitapAdi;
    }


    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {

        this.yazarAdi = yazarAdi.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setKitapFiyati(int kitapFiyati) {

        this.kitapFiyati = kitapFiyati * 18;//dolar olarak girilen kitap fiyatını tl ye çevidik

    }

    @Override
    public String toString() {
        return "" + id +
                "   " + kitapAdi +
                "    " + yazarAdi + "   " +
                kitapFiyati + "tl";

    }
}

