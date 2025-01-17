package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String arr2[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double toplam = 0;

        for (int i = 0; i < 3; i++) { //outer arr
            for (int j = 0; j < 3; j++) { //inner arr
                if (arr2[i][j].contains("$")) {
                    toplam += Double.parseDouble((arr2[i][j].replace("$", ""))) * 3.2;
                } else if ((arr2[i][j].contains("€"))) {
                    toplam += Double.parseDouble((arr2[i][j].replace("€", ""))) * 4.2;
                }
            }
        }
        System.out.println("toplam = " + toplam);  //toplam = 374.6


        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double dolarToplam=0;
        double euroToplam=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {

                    dolarToplam +=(Double.parseDouble(arr[i][j].replace("$", ""))* 3.2);

                } else if (arr[i][j].contains("€")) {

                    euroToplam += Double.parseDouble(arr[i][j].replaceAll("\\D", "")) * 4.2;

                }
            }
        }
       // System.out.println("Dolar Toplam : "+ dolarToplam+"\nEuro Toplam : "+ euroToplam);
        System.out.println(dolarToplam+euroToplam);
    }
}



