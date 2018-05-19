package automobile;

public class InheritanceCars {
    // No modifier - accessible within the same package
    int speed;

    // Private - accessible withing the class only (or need to use setters)
    private int privateSpeed;

    // Accessible anywhere with importing package and class
    public int publicSpeed;

    //Accesible within same pachake and subclasses (even outside of the package)
    protected int protectedSpeed;

    public void setPrivateSpeed(int privateSpeed) {
        this.privateSpeed = privateSpeed;
    }

    public InheritanceCars(){
        this.speed = speed;
    }

    public InheritanceCars (int startSpeed){
        speed = startSpeed;
    }

    public void increaseSpeed(){
        speed++;
        System.out.println("Increasing speed of cars");
    }

    public void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing speed of cars");
    }
}
