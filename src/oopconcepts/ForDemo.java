package oopconcepts;

public class ForDemo {
    public static void main (String[] args){
        for (int i = 0; i <= 10; i++){
            System.out.println("Value of i: " + i);
        }
        int[] numbers = {10, 20, 30};
        System.out.println("Array length is: " + numbers.length);

        for (int i = 0; i < numbers.length; i++){
            System.out.println("The value of index " + i + " is: " + numbers[i]);
        }

        for (int number: numbers) {
            System.out.println("The value is: " + number);
        }

        String[] car = {"bwm", "audi", "honda"};
        for (String number: car) {
            System.out.println("The car is " + number);
        }

    }
}
