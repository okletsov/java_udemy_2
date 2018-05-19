package oopconcepts;

import automobile.InheritanceBMW;
import automobile.InheritanceCars;

public class InheritanceDemo {
    public static void main(String[] args) {

        int speed = 0;
        InheritanceCars c1 = new InheritanceCars(speed);
        c1.increaseSpeed();

        InheritanceBMW bmw1 = new InheritanceBMW(speed);
        bmw1.increaseSpeed();
        bmw1.headUpDisplayNavigation();
    }
}
