import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        /*
            Write a program that determines whether there is a subset of the any given non-negative integer set
            where this subset is equal to a given value.
            Example:
            Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
            Output: True
            There is a subset (4, 5) with sum 9.
            Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
            Output: False
            There is no subset that add up to 30
         */

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(34);
        set.add(4);
        set.add(12);
        set.add(5);
        set.add(2);

        int sum = 17;

        // Set'i List'e çevirdik
        List<Integer> list = new ArrayList<>();
        for(Integer each: set){
            list.add(each);
        }

        // Sonucu tutacak boolean oluşturduk
        boolean result = false;

        // List'teki elemanları gezdik
        for (int i=0; i<list.size();i++){
            for(int j=1;j<list.size();j++){

                // İndexleri farklı olan elemanları kontrol etmesini sağladık
                if(i!=j){
                    if (list.get(i)+list.get(j)==sum){
                        result=true;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
