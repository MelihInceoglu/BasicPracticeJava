package practice_basic_day02;

import java.util.Scanner;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("not giriniz");
        char score = scanner.next().toUpperCase().charAt(0);

        String scoreLetter = (score=='A'||score=='B'||score=='C') ?
                ((score=='A'? "Gayet Basarili": (score=='B' ? "Basarili": "Ha gayret")))
                : "DİGERLERI";

        System.out.println(scoreLetter);




    }
/*
    public static void main(String[] args) {

        char finalNotu = 'B';

        // String result ="";

        String result = (finalNotu == 'A') ? "Gayet Basarili" :
                (finalNotu == 'B') ? "Basarili" :
                        (finalNotu == 'C') ? "Ha gayret" : "Digerleri..";

        System.out.println("result = " + result);


    }

 */
}
