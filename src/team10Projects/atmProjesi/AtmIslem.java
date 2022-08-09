package team10Projects.atmProjesi;

import java.util.Scanner;

public class AtmIslem {

    static boolean degistir = false;
    static Scanner scan = new Scanner(System.in);
    AtmKaliphane musteri1 = new AtmKaliphane("sumeyye guler", "1234567891234567", "asdfgh", 1000);

    void sifreEkran() {
        while (true) {
            System.out.println("kart numaranızı giriniz : ");
            String kartno = scan.nextLine().replaceAll(" ", "");
            System.out.println("sifre giriniz : ");
            String sifre = scan.next();
            scan.nextLine();
            if (degistir) {
                if (kartno.equals(musteri1.getKartNo()) && sifre.equals(musteri1.getSifre())) {
                    break;
                }
            } else if (kartno.equals(musteri1.getKartNo()) && sifre.equals(musteri1.getSifre())) {

                menu1();
                break;
            }
        }

    }

    private void menu1() {
        System.out.println("seçim yapınız : ");
        System.out.println("1 - Bakiye sorgula\n2 - para yatirma\n3 - para çekme\n4 - para gönderme\n5 - sifre değiştirme\n6 cikis");
        int islem = 0;
        try {
            islem = scan.nextInt();
        } catch (Exception e) {
            System.out.println("hatalı giriş");
            menu1();
        }

        switch (islem) {
            case 1:
                bakiyeSorgula();
                menu1();
                break;
            case 2:
                paraYatir();
                menu1();
                break;
            case 3:
                paraCek();
                menu1();
                break;
            case 4:
                paraGonder();
                menu1();
                break;
            case 5:
                sifreDegistir();
                menu1();
                break;
            case 6:
                cikiss();
                break;
            default:
                System.out.println("gecerli secim yapınız");
        }
    }

    private void bakiyeSorgula() {
        System.out.println("bakiyeniz : " + musteri1.getBakiye());
    }

    private void paraYatir() {
        System.out.println("yatırmak istediğiniz ücreti giriniz :");
        int yatirilanUcret = scan.nextInt();
        musteri1.setBakiye(musteri1.getBakiye() + yatirilanUcret);
        bakiyeSorgula();

    }

    private void paraCek() {
        System.out.println("çekmek istediğiniz ücretii giriniz : ");
        int cekilecekUcret = scan.nextInt();
        if (musteri1.getBakiye() >= cekilecekUcret) {
            musteri1.setBakiye(musteri1.getBakiye() - cekilecekUcret);
        } else {
            System.out.println("yetersiz bakiye!");
        }
    }

    private void paraGonder() {
        Scanner scan2=new Scanner(System.in);
        System.out.println("para göndermek istediğiniz iban ı giriniz : ");
        scan.nextLine();
        String iban = scan2.nextLine().replaceAll(" ", "").toUpperCase();
        int gonderilecekUcret = 0;

        if (iban.startsWith("TR") && iban.length() == 4) {
            System.out.println("göndermek istediğiniz ucreti giriniz :");
            gonderilecekUcret = scan2.nextInt();
        } else {
            System.out.println("iban yanlış");
            menu1();
        }
        if (gonderilecekUcret <= musteri1.getBakiye()) {
            System.out.println("islem tamamlandı");
            musteri1.setBakiye(musteri1.getBakiye() - gonderilecekUcret);
            System.out.println(musteri1);
            bakiyeSorgula();

        } else {
            System.out.println("yetersiz bakiye");
            menu1();
        }

    }

    private void sifreDegistir() {
        Scanner scan1=new Scanner(System.in);
        System.out.println("kart numaranızı giriniz : ");
        String kartno = scan1.nextLine().replaceAll(" ", "");
        System.out.println("sifre giriniz : ");
        String sifre = scan1.next();


            if (kartno.equals(musteri1.getKartNo()) && sifre.equals(musteri1.getSifre())) {
                System.out.println("yeni sifre giriniz ");
                musteri1.setSifre(scan.next());
                System.out.println("basarıyla değişti");
            }else
            {
                sifreDegistir();
            }
        }

    private void cikiss() {
        System.out.println("güle güle");
    }
}