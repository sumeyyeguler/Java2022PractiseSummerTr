package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


    /*
    Problem tanimi :
    Kullanicidan  yasini ve kilosunu alaliniz
    18 yasindan kucuk ise kan bagisi yapamaz
    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();
        System.out.println("lütfen kg giriniz : ");
        double kg = scan.nextDouble();

        if (yas < 18) {
            System.out.println("yasınız kan bağısı yapmaya uygun değildir.");
        } else {
            if (kg < 50) {
                System.out.println("yasınız uygun fakat kilonuz uygun değil, kan bağışı yapamazsınız");
            } else if (kg >= 50) {
                System.out.println("kan bagısı yapabilirsiniz ");
            }
        }
    }
}



