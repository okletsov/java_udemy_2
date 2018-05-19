package oopconcepts;

public class WhileDemo {
    public static void main (String [] args) {
        int i = 10;
//        while (i < 20){
//            i++;
//            if (i == 17){
//                continue;
//            }
//            System.out.println(i);
//        }

        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("Outside loop...");
    }
}
