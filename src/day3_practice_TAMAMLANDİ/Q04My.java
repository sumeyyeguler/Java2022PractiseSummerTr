package day3_practice_TAMAMLANDİ;

public class Q04My {
    public static void main(String[] args) {
        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        String kelime="sümeyye";
        String ortaKarakter=kelime.substring(kelime.length()/2,(kelime.length()/2)+1);
        //System.out.println(ortaKarakter);

        if (!(kelime.length()%2==0)&& (kelime.length()>=3)){
            System.out.println(ortaKarakter);
        }
    }
}
