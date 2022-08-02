package recap2_TAMAMLANDİ;

import java.util.Scanner;

public class Q01me {
    public static void main(String[] args) {
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
        Scanner scan = new Scanner(System.in);
        System.out.println("hangi gün için ders programını görmek istersiniz : ");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "salı":
                System.out.println("java dersi günleri");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("selenyum dersi günleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("sql dersi günleri");
                break;
            default:
                System.out.println("izin günleri");


        }
    }
}
