package day4_practice_TAMAMLANDİ;

public class Q01My {
    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

        String input= "aabbcccccddddaaa";
        System.out.println(birKezYazdir(input));
    }

    private static String birKezYazdir(String input) {
        String box="";
        for (int i = 0; i <input.length() ; i++) {
            if (!box.contains(input.substring(i,i+1))){
                box+=input.substring(i,i+1);
            }
        }
        return box;
    }
}
