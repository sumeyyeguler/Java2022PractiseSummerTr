package day9_practise_TAMAMLANDİ.restaurant;

public class Mutfak {

    //instance variable tanımlayacağız.

    public String yemekler="adana kebap ,urfa ciğer, kuşbaşı, küşleme";
    public String araSicak="yayla corbasi ,mercimek corbasi, dugun corbasi, corba";
    public String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler="ayran, salgam, kola";

    public Mutfak() {
        //this("adana kebap","mercimek","kunefe","salgam"); böyle yazarsak const. call olur
        //ve parametreli const. a gider
    }

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
    //atamaları yapmamız gerekiyor, this olmazsa dinamik olmaz
    //
    this.yemekler=yemekler;
    this.araSicak=araSicak;
    this.tatlilar=tatlilar;
    this.icecekler=icecekler;

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\naraSicak='" + araSicak + '\'' +
                ",\ntatlilar='" + tatlilar + '\'' +
                ",\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
