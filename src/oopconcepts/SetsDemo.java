package oopconcepts;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        // Set only stores unique elements

        //HashSet - does not have order
        Set<String> set = new HashSet<>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");

        System.out.println("Hash Set: " + set);

        System.out.println("\nSet iteration:");
        for (String item: set) {
            System.out.println(item);
        }

        // Linked HashSet - maintains the order in which elements are added
        Set<String> lHSet = new LinkedHashSet<>();

        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        lHSet.add("Honda");

        System.out.println("Linked Hash Set: " + lHSet);

        // TreeSet - maintains natural sorting order: 1, 2, 3... a, b, c...
        Set<String> tSet = new TreeSet<>();

        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        tSet.add("Honda");

        System.out.println("Tree Set: " + tSet);


        List<String> list = new ArrayList<>();

        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");

        System.out.println("List: " + list);
    }
}
