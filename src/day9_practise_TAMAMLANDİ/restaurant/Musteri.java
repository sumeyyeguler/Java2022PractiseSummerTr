package day9_practise_TAMAMLANDİ.restaurant;

public class Musteri {

    // menü obje create edilecek
    // siparis objesi create edilecek
    //objeleri mutfak classından create edeceğim

    public static void main(String[] args) {

        Mutfak menu = new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim=new Mutfak("adana kebap","mercimek","kunefe","salgam");
        System.out.println(siparisim);
    }
}
