package staticpackage;

public class StaticKeyNotes {

        // Static method cannot use non-static variables or methods directly
        // because if variable or method is non-static - it DOES NOT EXIST
        // UNTIL AN INSTANCE OF A CLASS IS CREATED
        // This and super cannot be used in static context

        public int addNum = 10;
        public static int addNumStatic = 10;

    public static void main(String[] args) {
        StaticKeyNotes s1 = new StaticKeyNotes();
        int output = s1.sum(20);
        int staticOutput = sumStatic(10);
        System.out.println("The output is: " + output);
        System.out.println("The output is: " + staticOutput);
    }

    public int sum (int num){
        return num + addNum;
    }

    public static int sumStatic (int num){
        return num + addNumStatic;
    }
}
