package oopconcepts;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(100); // initial capacity can be empty

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
    }
}
