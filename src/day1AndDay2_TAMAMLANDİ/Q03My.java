package day1AndDay2_TAMAMLANDİ;

public class Q03My {
    public static void main(String[] args) {
             /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double(ondalıklı büyük) > float(ondalıklı küçük)ve sonuna f konulur >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        /*

    Primitive type’larda (==) kullanırsak bu değişkenlerin içindeki değerlerin eşit olup olmadığına kontrol eder.

    Örneğin
    int a = 5;
    int b = 5;
    System.out.println(a == b);
    Sonuç true olarak dönecektir.

    Reference type’larda ise (==) nesnelerin adreslerinin eşit olup olmadığını kontrol eder.
    Eğer değişkenlerin içindeki değerlerin eşit olup olmadığını kontrol etmek istiyorsak,
     bu durumda equals metodu kullanılır.
         */
        int intMinValue=Integer.MIN_VALUE;
        System.out.println("intMinValue = " + intMinValue);
        int intMaxValue=Integer.MAX_VALUE;
        System.out.println("intMaxValue = " + intMaxValue);

        double doubleMinValue=Double.MIN_VALUE;
        System.out.println("doubleMinValue = " + doubleMinValue);
        double doubleMaxValue=Double.MAX_VALUE;
        System.out.println("doubleMaxValue = " + doubleMaxValue);
        
        short shortSize=Short.SIZE;
        System.out.println("shortSize = " + shortSize);

        short shortMaxValue=Short.MAX_VALUE;
        System.out.println("shortMaxValue = " + shortMaxValue);
        short shortMinValue=Short.MIN_VALUE;
        System.out.println("shortMinValue = " + shortMinValue);

       short sayi1=32333;
       short sayi2=32456;

       short karsilastirma= (short) Short.compare(sayi1,sayi2);
        System.out.println("karsilastirma = " + karsilastirma);

        
    }
}
