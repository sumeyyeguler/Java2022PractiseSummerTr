package day7_practiceTAMAMLANDİ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q03My {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 7}, {2, 4, 6}, {9, 8, 7}};
        sirala(arr);

    }

    private static void sirala(int[][] arr) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                liste.add(arr[i][j]);
            }
        }

        Collections.sort(liste);
        System.out.println(liste);
    }
}
