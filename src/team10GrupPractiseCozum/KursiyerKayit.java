package team10GrupPractiseCozum;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KursiyerKayit {
    //normalde list olustururken int string vs yazıyorduk, ama burda kursiyer bilgilerini
    //koymamız isteniyor. class ismi yazarak kursiyerde olan tüm objeleri liste halinde versin diye
   static int sayac=1000;
    List<Kursiyer> kisiler=new ArrayList<>();
    public List<Kursiyer> kayitYap(){
        Scanner scan= new Scanner(System.in);
        System.out.println("adnızı ve soyadınızı giriniz");
        String isim=scan.nextLine();
        System.out.println("bransınızı giriiniz \nQA\nDEV\nSALESFORCE\nCYBER SECURITY");
        String brans=scan.next().toUpperCase();
        int id=++sayac;
        Kursiyer p1=new Kursiyer(isim, id,brans, LocalTime.now());
        kisiler.add(p1);
        return kisiler;

    }
    public void ucretsizKursiyer(List<Kursiyer> kis){
        for (Kursiyer a :kis ) {
            int a1=0;
            if(a.id%5==0){
                System.out.println("tebrikler "+a.isim+" kursumuz size ucretsizdir ");
            }if(a.id%5!=0&& (a1+"").contains(a.id+"")){
                System.out.println("henüz ücretsiz kişi yoktur");
            }break;

        }

        }
    public void kursUcreti(List<Kursiyer> kisss){
        for (Kursiyer each:kisss){
            if(each.id%5!=0){
                if(each.brans.charAt(0)=='Q'){
                    System.out.println(each.isim+" kurs ucretiniz: 850€");
                }
                if(each.brans.charAt(0)=='D'){
                    System.out.println(each.isim+" kurs ucretiniz: 1050€");
                }
                if(each.brans.charAt(0)=='C'){
                    System.out.println(each.isim+" kurs ucretiniz: 750€");
                }
                if(each.brans.charAt(0)=='S'){
                    System.out.println(each.isim+" kurs ucretiniz: 950€");
                }
            }else System.out.println(each.isim+" kurs ucretiniz :0");
        }
    }
    public void listeYap(List<Kursiyer> kisss){
        for (Kursiyer each:kisss) {
            System.out.println(each.id+"  "+each.isim+"  "+each.brans+"  "+each.kayitZamani);

        }
    }




}
