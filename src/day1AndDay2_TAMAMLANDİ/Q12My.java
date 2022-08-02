package day1AndDay2_TAMAMLANDİ;

import java.util.Scanner;

public class Q12My {
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

        //EQUALSIGNORECASE İLE DE YAPABİLİRİZ

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iş ünvanınızı giriniz :");
        String unvan= scan.nextLine().toLowerCase();

        if (unvan.equals("qa")){
            System.out.println("Quality Analyst");
        }else if (unvan.equals("dev")){
            System.out.println("developer");
        }else if (unvan.equals("ba")){
            System.out.println("business analyst");
        }else if (unvan.equals("pm")){
            System.out.println("project manager");
        }else System.out.println("geçerli bir unvan giriniz");
    }
}
