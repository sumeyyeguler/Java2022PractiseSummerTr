package recap1_TAMAMLANDİ;

import java.util.Scanner;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("final notunuzu giriniz : ");
        double finalNot = scan.nextDouble();

        System.out.println(finalNot > 40 && finalNot < 60 ? "notunuz C, ha gayret" :
                finalNot < 70 ? "notunuz B, basarılı":"notunuz A, gayet başarılı");
    }
}
