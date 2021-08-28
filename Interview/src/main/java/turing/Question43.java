package turing;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Sadman
 */
public class Question43 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(3);
        set.add((int)3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));

        System.out.println(set);
    }
}
