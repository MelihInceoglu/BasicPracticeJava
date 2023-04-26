package practice_basic_day04;

import java.util.*;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim

        List<String> isimler = new ArrayList<>();
        isimler.add("ali");
        isimler.add("can");
        isimler.add("veli");

        Scanner scan = new Scanner(System.in);


        boolean kaydedildiMi =false;

        int varMi;

        Random random = new Random();
        int rastgeleSayi = random.nextInt(100);

       do {
           System.out.println("Isminizi girin");
           String isim = scan.nextLine();
           isim = isim.toLowerCase().replace(" ","");

           if (isim.length()>=3){
               if (isimler.contains(isim)){
                   System.out.println("Bu isim mevcut\nLütfen "+ isim+rastgeleSayi+" şeklinde kaydetmeyi deneyiniz");
               }else{
                   isimler.add(isim);
                   kaydedildiMi=true;
               }
           }
       }while (!kaydedildiMi);

        System.out.println("Kullanici ismi basariyla kaydedildi");
        System.out.println(isimler);






    }
}
