package list;

import java.util.*;

/**
 * Created by Sadman on 3/8/2020.
 */
public class LinkedListExample {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        List<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        names.add("lokesh");
        names.add("alex");
        names.set(1, "brian");
        names.remove(1);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.clear();
        System.out.println(names);
    }
}
