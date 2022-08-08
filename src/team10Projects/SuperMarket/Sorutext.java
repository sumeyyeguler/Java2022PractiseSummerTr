package team10Projects.SuperMarket;


import java.util.Scanner;


public class Sorutext {
    static Scanner scan = new Scanner(System.in);
    static int urunKodu;
    static int urunAdedi;
    static int toplam;
    static String sepet = "";
    static int urunFiyati;
    static boolean ekUrun = false;
    static String urunAdi;
    //static String urunUcret; kullanmaya gerek kalmadı


    /*
   ====================PROJEMIZ===================================
* ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 manav,
   2 sarkuteri,
   3 market
   secime gor ,
   4-urunleri listele ve
   5-fiyatlari gelsin
*
* Basrili Market alış-veriş programı.
   1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

* 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
   * 3. Adım: Kaç kg satın almak istediğini sorunuz.
     4. Adım: Alınacak bu ürünü
* sepete ekleyiniz ve Sepeti yazdırınız.
    5. Başka bir ürün alıp almak
* istemediğini sorunuz.
    6. Eğer devam etmek istiyorsa yeniden ürün seçme
* kısmına yönlendiriniz.
    7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
* ödeme sonrasında programı bitiriniz
*/






    public static void main(String[] args) {
        girisEkranı();
    }

    private static void girisEkranı() {
        System.out.println("****** TEAM10 SUPERMARKET ******");
        System.out.println("----------- MENU -----------");
        System.out.println("1 - Manav Reyonu\n2 - Şarküteri Reyonu\n3 - Market Reyonu\n4 - Fiş\n5 - Çıkış");
        int secim = scan.nextInt();

        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("geçerli bir seçim yapınız");
            girisEkranı();
        } else
            switch (secim) {
                case 1:
                    manavReyonu1();
                    break;
                case 2:
                    sarkuteriReyonu1();
                    break;
                case 3:
                    marketReyonu1();
                    break;
                case 4:
                    fis1();
                    break;
                case 5:
                    cikis1();
                    break;
            }
    }

    private static void sarkuteriReyonu1() {
        System.out.println("Alacağınız ürünün kodnu giriniz:\n6 - Pastırma 600 TL\n7 - Tavuk 33 TL\n" +
                "8 - Salam 79 TL\n9 - Kasar 130 TL\n10  - Ciğer 150 TL");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 6 && urunKodu <= 10) {
                System.out.println("kaç adet ürün alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 6:
                        urunAdi = "Pastırma";
                        urunFiyati = 600;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 7:
                        urunAdi = "Tavuk";
                        urunFiyati = 33;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 8:
                        urunAdi = "Salam";
                        urunFiyati = 79;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 9:
                        urunAdi = "Kasar";
                        urunFiyati = 130;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 10:
                        urunAdi = "Ciğer";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                }
                urunFiyati = urunFiyati * urunAdedi;
                //urunUcret=""+urunFiyati;
                toplam += urunFiyati;
                System.out.println("toplam fiyat : " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " tl'dir\n";
                //System.out.println(sepet);
                System.out.println("ek ürün almak isterseniz ürün kodunu giriniz, ana menü için 0 tuşlayınız. ");

            } else if (urunKodu == 0) {
                girisEkranı();
            }
        }

    }


    private static void manavReyonu1() {
        System.out.println("Alacağınız ürünün kodnu giriniz:\n1 - Patates 10 TL\n2 - Biber 14 TL\n" +
                "3 - Soğan 8 TL\n4 - Havuç 4 TL\n5  - Elma 10 TL");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 1 && urunKodu <= 5) {
                System.out.println("kaç adet ürün alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 1:
                        urunAdi = "Patetes";
                        urunFiyati = 10;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 2:
                        urunAdi = "Biber";
                        urunFiyati = 14;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 3:
                        urunAdi = "Soğan";
                        urunFiyati = 8;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 4:
                        urunAdi = "Havuç";
                        urunFiyati = 4;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 5:
                        urunAdi = "Elma";
                        urunFiyati = 10;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                }
                urunFiyati = urunFiyati * urunAdedi;
                //urunUcret=""+urunFiyati;
                toplam += urunFiyati;
                System.out.println("toplam fiyat : " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " tl'dir\n";
                //System.out.println(sepet);
                System.out.println("ek ürün almak isterseniz ürün kodunu giriniz, ana menü için 0 tuşlayınız. ");

            } else if (urunKodu == 0) {
                girisEkranı();
            }


        }
    }


    private static void cikis1() {
        System.out.println("YİNE BEKLERİZ..");
    }

    private static void fis1() {
        System.out.println("toplam ödeme tutarı : "+toplam);
        System.out.println("kaç tl ödeme yapacaksınız : ");
        int bakiye= scan.nextInt();

        if (bakiye<toplam){
            System.out.println("bakiye yetersiz!!");
        }else
            System.out.println("****FİŞ DETAYI*****");
            fisDetayi();
        System.out.println("para üstü :"+(bakiye-toplam));
        cikis1();
        //String bakiye= scan.next();
       // double bakiye1=Double.parseDouble(bakiye);
       // int bakiye2=Integer.parseInt(bakiye);
    }

    private static void fisDetayi() {
        System.out.println(sepet);

    }

    private static void marketReyonu1() { System.out.println("Alacağınız ürünün kodnu giriniz:\n11 - çikolata 5 TL\n12 - çay 56 TL\n" +
            "13 - şeker 140 TL\n14 - un 89 TL\n15  -ekmek 4 TL");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 11 && urunKodu <= 15) {
                System.out.println("kaç adet ürün alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 11:
                        urunAdi = "çikolata";
                        urunFiyati = 5;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 12:
                        urunAdi = "çay";
                        urunFiyati = 56;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 13:
                        urunAdi = "şeker";
                        urunFiyati = 140;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 14:
                        urunAdi = "un";
                        urunFiyati =89;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                    case 15:
                        urunAdi = "Ekmek";
                        urunFiyati = 4;
                        System.out.println(urunAdedi + " adet/kg " + urunAdi + " : " + (urunFiyati * urunAdedi) + " TL'dir.");
                        break;
                }
                urunFiyati=urunFiyati*urunAdedi;
                //urunUcret=""+urunFiyati;
                toplam+=urunFiyati;
                System.out.println("toplam fiyat : "+toplam);
                sepet+=urunAdi+" : "+urunFiyati+" tl'dir\n";
                //System.out.println(sepet);
                System.out.println("ek ürün almak isterseniz ürün kodunu giriniz, ana menü için 0 tuşlayınız. ");

            }else if (urunKodu==0){
                girisEkranı();
            }
    }





}}