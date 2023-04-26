import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1 {
    public static void main(String[] args) {
        //Find the smallest absolute difference between two given integers in an unsorted array.
        //If there are multiple pairs, find them all.

        List<Integer> farkSayilarList = new ArrayList<>();
        List<Integer> farklar = new ArrayList<>();
        int length = 4;
        int[] array = {-520, -470, -20, 30};

        farkSayilarList = farklariBul(array);

        for (int i = 0; i < farkSayilarList.size(); i+=3) {
            if (farkSayilarList.get(i) < 0) {
                int fark = (-1)*farkSayilarList.get(i);
                farklar.add(fark);
            } else {
                farklar.add(farkSayilarList.get(i));
            }
        }

        int enkucuk = Integer.MAX_VALUE;
        for (int i = 0; i < farklar.size(); i++) {
            if (farklar.get(i)<enkucuk) {
                enkucuk = farklar.get(i);
            }
        }

        for (int i = 0; i < farkSayilarList.size(); i+=3) {
            if (farkSayilarList.get(i) == enkucuk || farkSayilarList.get(i)*(-1) == enkucuk) {
                System.out.print(farkSayilarList.get(i + 1) + " ");
                System.out.print(farkSayilarList.get(i + 2) + " ");
                System.out.println();
            }
        }
    }

    private static List<Integer> farklariBul(int[] array) {
        List<Integer> farkSayilarList = new ArrayList<>();
        int enKucukFark = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j]) {
                    int fark = array[i] - array[j];
                    if (fark < enKucukFark) {
                        farkSayilarList.add(fark);
                        farkSayilarList.add(array[i]);
                        farkSayilarList.add(array[j]);
                    }
                }
            }
        }
        System.out.println("===");
        System.out.println(farkSayilarList);
        System.out.println("===");
        return farkSayilarList;
    }


}