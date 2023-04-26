package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)
    public static void main(String[] args) {

        System.out.println(multiply(2.5, 3.8, 97.9, 1));
    }

    public static double multiply(double... sayilar){
        double sonuc=1;

        for (double each: sayilar
             ) {
            sonuc *= each;
        }
        return sonuc;
    }


}
