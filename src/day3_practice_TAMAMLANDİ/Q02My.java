package day3_practice_TAMAMLANDİ;

public class Q02My {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


       String input="xyzmaskf";

        System.out.println(xyzVarMi(input));

    }

    private static boolean xyzVarMi(String input) {
        boolean varMi;
        if (input.contains("xyz")){
            varMi=true;
        }else
            varMi=false;
        return varMi;
    }
}
