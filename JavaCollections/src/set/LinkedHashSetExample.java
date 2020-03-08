package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Sadman on 3/8/2020.
 */
public class LinkedHashSetExample {
    public static void main(String[] args){
        //1. Create LinkedHashSet
        LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<>();

        //2. Add elements to LinkedHashSet
        LinkedHashSet.add("A");
        LinkedHashSet.add("B");
        LinkedHashSet.add("C");
        LinkedHashSet.add("D");
        LinkedHashSet.add("E");

        System.out.println(LinkedHashSet);

        //3. Check if element exists
        boolean found = LinkedHashSet.contains("A");        //true
        System.out.println(found);

        //4. Remove an element
        LinkedHashSet.remove("D");

        //5. Iterate over values
        Iterator<String> itr = LinkedHashSet.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }
    }
}
