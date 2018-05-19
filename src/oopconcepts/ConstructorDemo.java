package oopconcepts;

public class ConstructorDemo {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println(c1.speed);
        System.out.println(c1.gear);

        System.out.println("*****************");

        Car c2 = new Car(10, 1);
        System.out.println(c2.speed);
        System.out.println(c2.gear);

        Car c3 = new Car(1800, "green");
        System.out.println(c3.year);
        System.out.println(c3.color);
    }
}
