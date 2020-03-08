package map;

import java.util.HashMap;

/**
 * Created by Sadman on 3/8/2020.
 */
public class HashMapExample {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);
    }
}
