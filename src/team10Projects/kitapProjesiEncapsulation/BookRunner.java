package team10Projects.kitapProjesiEncapsulation;

import static team10Projects.kitapProjesiEncapsulation.BookIslem.menu2;

public class BookRunner {
    public static void main(String[] args) {

       /*
       eğer menu2() static olmazsa runner classta obje oluşturarak ulaşmalıyız.
       BookIslem obj1=new BookIslem();
        obj1.menu2();
       */

        menu2();//import ettik
    }
}
