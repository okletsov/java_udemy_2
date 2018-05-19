package exercise;

import java.util.Scanner;

public class ReverseStringExercise2 {
    public static void main(String[] args) {

        System.out.print("Enter text: ");
        Scanner userInput = new Scanner(System.in);
        String myString2 = userInput.nextLine();
        userInput.close();

        ReverseStringExercise2 output = new ReverseStringExercise2();
        String correctString2 = output.reverse2(myString2);
        System.out.println(correctString2);
    }

    private String reverse2(String string2) {
        String reversed = "";

        if (string2 == null || string2.length() == 0){
            System.out.println("Empty and NULL strings are not allowed");
        } else if (string2.length() == 1){
            System.out.println(string2);
        } else{
        char[] myArray2 = string2.toCharArray();
        for (int i = 0; i < myArray2.length; i++) {
            reversed = myArray2[i] + reversed;
        }
        }

        return reversed;
    }
}
