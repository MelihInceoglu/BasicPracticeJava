package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin = "sena.123";
        int girisHakki=4;

        System.out.println("Hosgeldiniz");

        while(true){
            System.out.println("Pin kodu giriniz");
            String girilenPin = scan.nextLine();

            if(girilenPin.equals(pin)){
                System.out.println("Giris basarılı");
                break;
            }else{
                System.out.println("Yanlıs giris");
                girisHakki--;
                System.out.println("Giris hakkınız : "+ girisHakki);
            }if(girisHakki==0){
                System.out.println("Sim kartı bloke oldu");
                break;
            }
        }
    }
}
