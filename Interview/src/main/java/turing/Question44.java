package turing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sadman
 */
public class Question44 {
    public static void main(String[] args) {
        Integer myArray[] = {2, 3, 1};
        List<Integer> list = Arrays.asList(2, 3, 1);
        list.sort(new Sorting());
        System.out.println(list);
    }

    static class Sorting implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
