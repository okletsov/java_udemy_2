package random;

import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        ExceptionsDemoAccount acc = new ExceptionsDemoAccount();
        try {
            System.out.println("1st line");
            // acc.withdraw(10);
            System.out.println("After trying the withdraw method");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Try again later");
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
