package interviewQuestions1;

import java.util.Scanner;

public class AsalSayi {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(asalMı(sayi));
    }

    private static boolean asalMı(int sayi) {
        boolean asalMi = true;

        if (sayi>=2){
            for (int i=2; i<sayi;i++){
                if (sayi%i==0 ){
                    asalMi = false;
                    break;
                }
            }
        }
        return asalMi;
    }
}
