package oopconcepts;

public class Car {

    public String color;
    private String make;
    private String model;
    public int year;
    int speed;
    int gear;

    public Car(){
        this(10,2);
        this.speed = 0;
        this.gear = 0;
        System.out.println("Execuring constructor without arguments");
    }

    public Car(int speed, int gear) {
        this(1900, "green");
        this.speed = speed;
        this.gear = gear;
        System.out.println("Execuring constructor with arguments");
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
        System.out.println("Execuring constructor with arguments 2");
    }

    public void increaseSpeed(){
        System.out.println("Increasing speed");
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("Year is not correct");
        }

    }

    public int getYear() {
        return year;
    }
}
