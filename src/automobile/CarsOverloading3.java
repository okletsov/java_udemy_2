package automobile;

public class CarsOverloading3 {

    // 1. Number of prameters is different
    // 2. Data types of parameters is different
    // 3. Sequence of data types is different

    // This Class describes #3

    public static void main(String[] args) {
        increaseSeatHeight(13, "14");
        increaseSeatHeight("15", 16);
    }

    public static void increaseSeatHeight(String variable1, int variable2 ){
        System.out.println("I am the first overload");
    }

    public static void increaseSeatHeight(int variable2, String variable1 ){
        System.out.println("I am the second overload");
    }

}
