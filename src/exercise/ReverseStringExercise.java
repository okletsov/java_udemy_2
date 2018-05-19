package exercise;

public class ReverseStringExercise {

    public static void main(String[] args) {
        String myString = "this is a test string";
        String output = reverseString(myString);
        System.out.println(output);
    }

    private static String reverseString(String myString){
        String correctString = "";
        String[] myArray = myString.split(" ");

        if (myString == null || myString.length() == 0){
            System.out.println("Empty and null strings are not allowed");
        } else if (myString.length() == 1) {
            System.out.println(myString);
        } else {
            for (int i = 0; i < myArray.length; i++) {
                correctString = myArray[i] + " " + correctString;
            }
        }
        return correctString;
    }
}
