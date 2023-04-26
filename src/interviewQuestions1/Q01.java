package interviewQuestions1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q01 {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
      abaa   ==> a=3  b=1
 */

    public static void main(String[] args) {

        String str ="alacann";
        String[] strArr = str.split("");
        Arrays.sort(strArr);

        int counter=0;

        for (int i=1; i<strArr.length; i++) {
            if (strArr[i-1].equals(strArr[i])){
                counter++;
            }else{
                System.out.println(strArr[i-1]+" sayısı "+ (counter+1));
                counter=0;
            }
            if (i==strArr.length-1){
                System.out.println(strArr[i]+" sayısı "+ (counter+1));
            }

        }







        /*
        List<String> harfListe = new ArrayList<String>();

        for (int i=0; i<str.length(); i++) {
            if (!harfListe.contains(str.substring(i,i+1))) {
                harfListe.add(str.substring(i,i+1));
            }
        }

        Collections.sort(harfListe);

         */
    }

}
