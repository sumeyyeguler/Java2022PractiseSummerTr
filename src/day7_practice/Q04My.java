package day7_practice;

public class Q04My {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        //arraysiz çözüm :)
        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println("str bosluk dahil uzunluk : "+str.length());//65
        str=str.replace(" ","");
        System.out.println("str bosluk haric uzunluk : "+str.length());//58
    }
}
