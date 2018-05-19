package oopconcepts;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        // Maps store elements in pairs, key -> value
        // one key-value pair is one entry
        // keys should be unique, values can be duplicated

        // HashMap - does not maintain order
        Map <Integer, String> map = new HashMap<>();

        //Add
        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(4, "Honda");

        //Get
        String value1 = map.get(1);
        System.out.println(value1);
    }
}
