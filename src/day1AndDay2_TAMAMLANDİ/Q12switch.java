package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q12switch {
    public static void main(String[] args) {

        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iş ünvanınızı giriniz :");
        String unvan= scan.nextLine().toLowerCase();

        switch (unvan){
            case "qa":
                System.out.println("quality analyst");break;

            case "dev":
                System.out.println("Developer");break;
            case "ba":
                System.out.println("Business Analyst");break;
            case "pm":
                System.out.println("Project Manager");break;
            default:
                System.out.println("geçerli bir unvan giriniz");
        }




    }
}
