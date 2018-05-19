package automobile;

public class InheritanceBMW extends InheritanceCars {
    public InheritanceBMW(int startSpeed){
        super(startSpeed);
    }

//    public void increaseSpeed(){
////
////    }


    @Override
    public void increaseSpeed() {
//        super.increaseSpeed();
        protectedSpeed++;
        System.out.println("Increasing speed of BMW");
    }

    public void headUpDisplayNavigation() {
        System.out.println("BMW specific functionality");
    }
}
