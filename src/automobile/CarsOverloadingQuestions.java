package automobile;

public class CarsOverloadingQuestions {

    // 1. Number of prameters is different
    // 2. Data types of parameters is different
    // 3. Sequence of data types is different

    public static void main(String[] args) {

    }

    public static void increaseSeatHeight(String variable1, int variable2 ){
        System.out.println("I am the first overload");
    }

    public static void increaseSeatHeight(String variable3, String variable4 ){
        System.out.println("I am the second overload");
    }
}
