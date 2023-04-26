package practice_basic_day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(0);

        maxIkiDegerBul(list);

    }

    private static void maxIkiDegerBul(List<Integer> list) {
        Collections.sort(list);
        System.out.println(list.subList(list.size()-2,list.size()));

    }

}
