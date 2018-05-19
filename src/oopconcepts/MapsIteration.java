package oopconcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {
    public static void main(String[] args) {

        // Hash Maps - does not maintain order
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "BMW");
        hashMap.put(6, "Audi");
        hashMap.put(4, "Honda");

        //Iteration over entry set
        System.out.println("\nIteration over entry set:");
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        //Iteration over key set
        System.out.println("\nIteration over key set:");
        for (Integer key: hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Linked Hash Map - maintain the order in which elements are added
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "BMW");
        linkedHashMap.put(6, "Audi");
        linkedHashMap.put(4, "Honda");

        System.out.println("\nIteration over Linked Hash Map:");
        for (Integer key: linkedHashMap.keySet()){
            String value = linkedHashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Tree Map - maintain the natural sorting (over key)
        Map<Integer, String> treeMap = new TreeMap<>();
    }
}
