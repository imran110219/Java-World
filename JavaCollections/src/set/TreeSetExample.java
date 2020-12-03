package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by Sadman on 3/8/2020.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        //1. Create LinkedHashSet
        TreeSet<String> treehSet = new TreeSet<>();

        //2. Add elements to LinkedHashSet
        treehSet.add("A");
        treehSet.add("B");
        treehSet.add("C");
        treehSet.add("D");
        treehSet.add("E");

        System.out.println(treehSet);

        //3. Check if element exists
        boolean found = treehSet.contains("A");        //true
        System.out.println(found);

        //4. Remove an element
        treehSet.remove("D");

        //5. Iterate over values
        Iterator<String> itr = treehSet.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }
    }
}
