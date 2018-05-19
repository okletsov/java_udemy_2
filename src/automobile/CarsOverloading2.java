package automobile;

public class CarsOverloading2 {

    // 1. Number of prameters is different
    // 2. Data types of parameters is different
    // 3. Sequence of data types is different

    // This Class describes #2

    public static void main(String[] args) {
        increaseSeatHeight(11);
        increaseSeatHeight("12");
    }

    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Seat height increased by " + heightToIncrease + " inches. Integer.");
    }

    public static void increaseSeatHeight(String heightToIncrease){
        System.out.println("Seat height increased by " + heightToIncrease + " inches. String.");
    }

}
