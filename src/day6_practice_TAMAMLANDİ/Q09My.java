package day6_practice_TAMAMLANDİ;

public class Q09My {
    public static void main(String[] args) {

        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */

        int arr1[][] = {{0, 2, -1}, {3, 8, 9}, {7}};
        int arr2[][] = {{-7, 6, -9}, {0, 12}, {19}};
        int toplamArr1 = 0;
        int toplamArr2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplamArr1 += arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                toplamArr2 += arr2[i][j];
            }
        }

        int tumArrayToplami=toplamArr1+toplamArr2;
        System.out.println("tüm arraylerin toplamı : "+tumArrayToplami);

    }
}
