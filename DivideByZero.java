import java.util.*;
import java.lang.*;
public class DivideByZero {
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int n=sc.nextInt();
        System.out.println("Enter the denominator");
        int d=sc.nextInt();
        try {
            int result = divide(n,d);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
