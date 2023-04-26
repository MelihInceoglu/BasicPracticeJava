package practice_basic_day04;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        str = str.replace(" ","");

        String[] arr = str.split("");

        int karakterSayisi = arr.length;

        System.out.println(karakterSayisi);


    }
}
