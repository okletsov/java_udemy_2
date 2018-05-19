package automobile;

public class InterfaceDemo implements CarsInterface, BMWInterface {
    @Override
    public void engineStart(String engineStart, boolean isKeyLess) {
        System.out.println("This is the implementation");
    }

    @Override
    public void headsUpNavigation() {
        System.out.println("This is headsUpNavigation implementation");
    }
}
