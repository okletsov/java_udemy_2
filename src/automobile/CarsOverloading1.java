package automobile;

public class CarsOverloading1 {

    // 1. Number of prameters is different
    // 2. Data types of parameters is different
    // 3. Sequence of data types is different

    // This Class describes #1

    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(10, false);
    }

    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Seat height increased by " + heightToIncrease + " inches");
    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
        System.out.println("Seat height increased by " + heightToIncrease + " inches");
        if (rememberHeight) {
            System.out.println("Seat height was remembered");
        } else {
            System.out.println("Seat height was not remembered");
        }
    }
}
