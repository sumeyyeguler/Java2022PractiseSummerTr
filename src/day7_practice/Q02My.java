package day7_practice;

import java.util.Arrays;

public class Q02My {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */


        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};


        System.out.println(Arrays.toString(toplaYazdir(arr)));

    }//main sonu

    private static double[] toplaYazdir(String[][] arr) {

        double[] arr1 = new double[2];
        double euroToplam = 0;
        double dolarToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    dolarToplam += Double.parseDouble(arr[i][j].replace("$", "")) * 3.2;

                } else if (arr[i][j].contains("€")) {
                    euroToplam += Double.parseDouble(arr[i][j].replace("€", "")) * 4.2;
                }
            }
        }
        arr1[0] = dolarToplam;
        arr1[1] = euroToplam;
        return arr1;
    }
}
