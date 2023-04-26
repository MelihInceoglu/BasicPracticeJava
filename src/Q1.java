import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        //Find the smallest absolute difference between two given integers in an unsorted array.
        //If there are multiple pairs, find them all.
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç elemanlı dizi oluşturmak istiyorsunuz?");
        int elemanSayisi = scan.nextInt();
        int[] arr = new int[elemanSayisi];
        int k=0;
        while(k<elemanSayisi){
            System.out.print("Eleman giriniz : ");
            int eleman = scan.nextInt();
            arr[k]=eleman;
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("===");

 */

        int[] array = {-520, -470, -20, 30};

        List<Integer> farklarList = farklariBul(array);
        System.out.println(farklarList);

        // Mutlak farkı bulmak için farkların 0dan küçük olup olmadığını kontrol ederiz
        List<Integer> mutlakFarklar = new ArrayList<>();
        for (int i=0;i<farklarList.size();i+=3){
            if (farklarList.get(i)<0){
                mutlakFarklar.add((-1)*farklarList.get(i));
            }else mutlakFarklar.add(farklarList.get(i));
        }
        System.out.println(mutlakFarklar);
        // Mutlak farklar listesindeki en küçük elemanı bulalım
        int enKucukFark = Integer.MAX_VALUE;
        for (int i=0;i<mutlakFarklar.size();i++){
            if (mutlakFarklar.get(i)<enKucukFark){
                enKucukFark=mutlakFarklar.get(i);
            }
        }
        int kucuk = mutlakFarklar.stream().mapToInt(v -> v).min().getAsInt();
        System.out.println("---"+ kucuk);

        // Fark - Eleman listesi ile enKucukFarkı kıyaslama
        for (int i=0;i<farklarList.size();i+=3){
            if (farklarList.get(i)==enKucukFark || farklarList.get(i) == (-1)*enKucukFark){
                System.out.println("En küçük fark : "+ enKucukFark);
                System.out.println("Elemanları : "+farklarList.get(i+1)+" "+farklarList.get(i+2));
            }
        }

    }

    private static List<Integer> farklariBul(int[] array){

        // Verilen arraydeki farkları ve elemanları liste atıyor
        List<Integer> farklarList = new ArrayList<>();

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if(i !=j){
                    int fark = array[i]-array[j];
                    farklarList.add(fark);
                    farklarList.add(array[i]);
                    farklarList.add(array[j]);

                }
            }
        }
        return farklarList;
    }
}
