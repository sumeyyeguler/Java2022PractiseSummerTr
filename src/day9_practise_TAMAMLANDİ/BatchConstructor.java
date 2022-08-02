package day9_practise_TAMAMLANDİ;

public class BatchConstructor {

    //constructordan obje üreteceğim, kalıphaneden(batch), method call yapacağım
    public static void main(String[] args) {

        Batch batch = new Batch(); //batch classından batch objesi üret dedik
        System.out.println("batch.str3 = " + batch.str3);

        batch.batch();
    }
}
