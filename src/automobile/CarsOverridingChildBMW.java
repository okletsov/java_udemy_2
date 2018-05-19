package automobile;

public class CarsOverridingChildBMW extends CarsOverridingParent {
/***
 * Rules foe overriding:
 * 1. Arguments list: Arguments list in the overriding method should be same as parent's class method
 * 2. Access modifier: Access modifier of the overriding method cannot be more restrictive than parent's method
 * 3. private, static and final method cannot be overridden as they are local to the class
 */

    public static void main(String[] args) {
        CarsOverridingParent c1 = new CarsOverridingChildBMW(); // assigning parent's class reference to child class. This allows to use methods from both parent and child classes
        c1.engineStart(5);
        c1.increaseSpeed();
    }

    @Override
    public void engineStart(int cyl){
        // super.engineStart(3); // super allows to call parent implementation of the method
        System.out.println("I am from the child class");
    }

    // This method does not override parent method wit hthe same name. It is just the static method in chuld class
    public static void staticExample() {
        System.out.println("I am a static method from child class");
    }
}
