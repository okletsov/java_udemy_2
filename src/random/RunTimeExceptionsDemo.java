package random;

public class RunTimeExceptionsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println("The result is c " + c);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Division by zero is not possible");
        }

        int[] numbers = {1, 2, 3};

        try {
            for (int i = 0; i <= 3; i++){
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array element with index " + e.getMessage() + " does not exist" );
        }
    }
}
