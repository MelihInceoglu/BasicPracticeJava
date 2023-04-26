package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */


        Scanner scan = new Scanner(System.in);

        int[] arr = new int[8];
        int i=0;
        int eleman=0;
        int sayac=0;

        while (i<arr.length){
            System.out.println("Bir sayi giriniz");
            eleman = scan.nextInt();
            arr[i] = eleman;
            if (arr[i]%3==0){
                sayac++;
            }
            i++;
        }

        System.out.println("Dizideki elemanlardan "+ sayac+" tanesi 3'e tam bölünüyor");


    }
}
