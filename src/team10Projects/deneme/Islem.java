package team10Projects.deneme;

import java.util.Scanner;

public class Islem {

    Kalip musterim = new Kalip("sümeyye güler", "123", "asd", 1000);

    void kartNoSifreAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kart numaranızı giriniz : ");
        String kartNo = scan.nextLine().replaceAll(" ", "");//TR
        System.out.println("sifrenizi giriniz :");
        String sifre = scan.next();

        if (kartNo.equals(musterim.getKartNo()) && sifre.equals(musterim.getSifre())) {
            System.out.println("başarılı giriş !!");
        } else {
            System.out.println("basarısız giriş !");
            kartNoSifreAl();
        }
        menuu();
    }

    void menuu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("işlem seçiniz : ");
        int islem = 0;

        try {
            islem = scan.nextInt();
        } catch (Exception e) {
            System.out.println("hatalı islem seçimi!");
            menuu();
        }

        switch (islem) {
            case 1:
                bakiye();
                break;
            case 2:
                pYatir();
                break;
            case 3:
                pCek();
                break;
            case 4:
                pGonder();
                break;
            case 5:
                sifreDegistr();
                break;
            case 6:
                cikilsin();
                break;
            default:
                System.out.println("geçerli seçim yapınız");
        }

    }

    private void bakiye() {
        System.out.println("bakiyeniz : " + musterim.getBakiye());

    }

    private void pYatir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("yatıracağınız ücreti giriniz : ");
        int yatirilanUcret = scan.nextInt();
        musterim.setBakiye(musterim.getBakiye() + yatirilanUcret);//burda sadece obje üzerinden set ettik
    }

    private void pCek() {
        Scanner scan = new Scanner(System.in);
        System.out.println("cekeceginiz ücreti giriniz : ");
        int cekilenUcret = scan.nextInt();

        if (cekilenUcret <= musterim.getBakiye()) {
            musterim.setBakiye(musterim.getBakiye() - cekilenUcret);
        } else {
            System.out.println("bakiye yetersiz");
            pCek();
        }

    }

    private void pGonder() {
    }

    private void sifreDegistr() {
    }

    private void cikilsin() {
    }


}//class sonu
