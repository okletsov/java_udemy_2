package automobile;

public class AbstractDemoBMW extends AbstractCars {
    public void setPrivateSpeed(int speed) {
        super.setPrivateSpeed(10);
    }

    @Override
    public void engineStarts(String keyType, int numOfCyl) {
        System.out.println("This is BMW engine start");
    }

//    @Override
//    public void engineStarts() {
//        super.engineStarts();
//        System.out.println("BWMs have keyless engine start");
//    }
}
