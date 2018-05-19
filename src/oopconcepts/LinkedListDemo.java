package oopconcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Array List - {0, 1, 2, 3, 4}
        // LinkedList - [0] > [1] > [2]
        //                  <     <   - has references to previous and next element in list

        // User ArrayList when you need to add to the end, remove from the end. Getting is fast
        // User LinkedList when when you need to add to the beginning, remove from the beginning

        LinkedList<String> cars = new LinkedList<String>(); // initial capacity can be empty

        //Add
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Audi");

        //Size
        int size = cars.size();
        System.out.println("The size of list is: " + size);

        //Get
        System.out.println("The value of index 1 is: " + cars.get(1));

        //Iteration
        // example 1
        System.out.println("\nFirst iteration example");
        for (int i = 0; i < size; i++){
            System.out.println(cars.get(i));
        }

        // example2
        System.out.println("\nSecond iteration example");
        for (String car : cars){
            System.out.println(car);
        }

        //Remove
        cars.remove(size - 1);
        System.out.println("\nThird iteration example (after removing)");
        for (String car : cars){
            System.out.println(car);
        }

        // Declaration
        List <Integer> lList = new LinkedList<>(); // can declare as 'List' and give type after 'new'
        List <Integer> aList = new ArrayList<>();

        runDuration(aList, "Array List");
        runDuration(lList, "Linked List");
    }

    public static void runDuration (List <Integer> list, String listType) {
        System.out.println("\nBeginning of the duration method for " + listType);

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        int size = list.size();
        int elementToAdd = size + 100000;

        long startTime = System.currentTimeMillis();

        // The following for loop demonstrates adding elements at the beginning is faster for Linked  List
        for (int i = size; i < elementToAdd; i++) {
            // list.add(i);
            list.add(0, i);
        }

        // Removing elements from the end of list
//        for (int i = 90000; i < 92000; i++) {
//            list.remove(i);
//        }


        // Removing elements from the beginning
//        for (int i = 0; i < 100; i++) {
//            list.remove(i);
//        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Duration of the list " + listType + " = " + duration + " ms");
    }
}
