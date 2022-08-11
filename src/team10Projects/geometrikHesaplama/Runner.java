package team10Projects.geometrikHesaplama;

import javax.naming.NamingEnumeration;

public class Runner extends Dikdortgen {
    public static void main(String[] args) {

        Dikdortgen obj=new Dikdortgen();
        System.out.println(obj.alan(6, 8));

        Cember obj2=new Cember();
        System.out.println(obj2.calan(3));
        System.out.println(obj2.ccevre(3));

        Kare obj3=new Kare();
        System.out.println(obj3.cevre(12, 12));
        System.out.println(obj3.alan(12, 12));

        Sekil obj4=new Sekil();
        System.out.println(obj4.alan(12, 18));

        Sekil Obj5=new Dikdortgen();
        System.out.println(Obj5.alan(12, 15));

        SekilIntarface obj6=new Kare();
        System.out.println(obj6.alan(3, 3));

        CevreAbs obj7=new Cember();
        System.out.println(obj7.ccevre(6));

        /*
        Kare obj8= (Kare) new Sekil();
        System.out.println(obj8.alan(10, 10));

         */

    }
}
