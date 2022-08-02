package recap2_TAMAMLANDİ;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

    /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1) \\d    ==> tum rakamlar
              \\D    ==> tum rakam disi character ler
        2) \\w   ==> A->Z		a->z			0->9    _
             \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
        3) \\s   ==> space
             \\S   ==> space disindaki hersey  */
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\W", "");
        System.out.println("str1 = " + str1);// ---> 1399
        str2 = str2.replaceAll("\\D", "");
        //System.out.println("str2 = " + str2); ---->1055

        double yeniStr1 = Double.parseDouble(str1);
        System.out.println("yeniStr1 = " + yeniStr1);
        yeniStr1 /= 100; //13.99


        double yeniStr2 = Double.parseDouble(str2);
        System.out.println("yeniStr2 = " + yeniStr2);
        yeniStr2 /= 100; //10.55

        double toplam = yeniStr1 + yeniStr2; //toplam = 24.54
        System.out.println("toplam = $" + toplam);


    }
}
