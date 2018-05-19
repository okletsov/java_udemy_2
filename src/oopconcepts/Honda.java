package oopconcepts;

import automobile.*;

public class Honda extends InheritanceCars {
    public void increaseHondaSpeed() {
        InheritanceCars c1 = new InheritanceCars(10);
        c1.publicSpeed = 10;
        c1.setPrivateSpeed(10);
        protectedSpeed = 100;

    }
}
