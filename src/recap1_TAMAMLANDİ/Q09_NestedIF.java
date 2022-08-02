package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q09_NestedIF {

    /*

    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas >= 18 && yas < 50) {
            System.out.println("yasınız oy kullanmaya uygun, bir kez oy kullanabilirsiniz.");
        } else if (yas < 70) {
            System.out.println("yasınız oy kullanmaya uygun, iki kez oy kullanabilirsiniz.");
        } else if (yas > 70) {
            System.out.println("yasınız oy kullanmaya uygun, uc kez oy kullanabilirsiniz.");
        } else System.out.println("gecerli bir yas giriniz");

    }
}
