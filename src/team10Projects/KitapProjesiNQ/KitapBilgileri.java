package team10Projects.KitapProjesiNQ;


public class KitapBilgileri {
    String kitapAdi;
    String yazarAdi;
    int id;
    int kitapFiyati;

    public KitapBilgileri() {
    }

    public KitapBilgileri(String kitapAdi, String yazarAdi, int id, int kitapFiyati) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.id = id;
        this.kitapFiyati = kitapFiyati;
    }
}
