import java.util.*;

public class S3 {
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

        Set<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(34);
        set.add(4);
        set.add(12);
        set.add(5);
        set.add(2);

        int sum = 9;

        boolean control = false;

        int[] array = new int[set.size()];
        int index=0;
        for(int each:set){
            array[index++]=each;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j<array.length; j++) {
                if (i!=j){
                    if(array[i]+array[j]==sum){
                        control=true;
                    }
                }

            }
        }

        System.out.println(control);
    }
}
