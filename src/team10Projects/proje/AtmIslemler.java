/* package team10Projects.proje;

import java.util.Scanner;

public class AtmIslemler {

    Atm musteri1 = new Atm("sümeyye güler", "1212", "1111 1111 1111 1111", 10000);
    static Scanner scan = new Scanner(System.in);

    void sifre() {
        System.out.println("kartlı işlem için 1\nkartsız işlem için 2 tuşlayınız. ");
        int sayi = scan.nextInt();

        boolean degistir = false;
        while (!degistir) {
            if (sayi == 1) {
                System.out.println("kart numaranızı giriniz : ");
                String kartNo = scan.nextLine().replaceAll("\\s", "");
                System.out.println("şifrenizi giriniz : ");
                String sifre = scan.nextLine();

                if (sifre.equals(musteri1.getSifre()) && kartNo.equals(musteri1.getKartNo())) {
                    degistir = true;
                } else {
                    System.out.println("sifre/kart no yanlış");
                }
            } else if (sayi == 2) {//kartsız işlem durumu
                System.out.println("sifrenizi giriniz : ");
                String sifre = scan.nextLine();
                if (sifre.equals(musteri1.getSifre())) {
                    System.out.println("sifre kabul edildi.");
                    degistir = true;
                } else {
                    System.out.println("sifre yanlış");
                }

            } else {
                System.out.println("yanlış seçim yaptınız");//1 veya 2 dışında seçim yapılırsa
                sifre();
            }
        }
    }

    void menu() {
        System.out.println("1 - Bakiye sorgula\n2 - para yatirma\n3 - para çekme\n4 - para gönderme\n5 - sifre değiştirme\n6 cikis");
        int secim = 0;
        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            System.out.println("hatalı giriş !");
            menu();
        }

        switch (secim) {
            case 1:
                bakiyeSorgula();

                break;
            case 2:
                paraYatir();

                break;
            case 3:
                paraCek();

                break;
            case 4:
                paraGonder();

                break;
            case 5:
                sifreDegistir();

                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("gecerli secim yapınız");
        }
    }

    private void paraYatir() {
        System.out.println("yatırmak istediğiniz tutarı giriniz : ");
        int yatirilanTutar = scan.nextInt();
        ;

        if (yatirilanTutar < 0) {
            yatirilanTutar=yatirilanTutar*(-1);}
            musteri1.setBakiye(musteri1.getBakiye() + yatirilanTutar * (-1));
            bakiyeSorgula();
        } else {
            musteri1.setBakiye(musteri1.getBakiye() + yatirilanTutar);
            bakiyeSorgula();
        }
    }

    private void bakiyeSorgula() {
        System.out.println("bakiyeniz : " + musteri1.getBakiye());
    }

}//classSonu


 */