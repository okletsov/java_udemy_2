package introduction;

import java.util.*;

public class ArraysDemo {

    public static void main(String[] arg){
        int[] myIntArray1;
        myIntArray1 = new int[4];

        myIntArray1[0] = 100;
        myIntArray1[1] = 90;

        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1 index: " + myIntArray1[1]);
        System.out.println("2 index: " + myIntArray1[2]);

        String[] myStringArray = {"bmw", "audi", "honda"};

        int len1 = myIntArray1.length;
        int len2 = myStringArray.length;

        System.out.println(len1);
        System.out.println(len2);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }

        Arrays.sort(myIntArray1);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }
    }
}
