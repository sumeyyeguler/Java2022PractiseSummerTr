package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        hangiGun();
        


    }//MAİN SONU

    private static void hangiGun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("hangi gün için ders programını görmek istersiniz : ");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("Sql dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;

            default:
                System.out.println("izin gunu");
        }

    }

}
