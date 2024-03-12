import java.util.*;
import java.lang.*;
public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberValidator {
    public static void validateNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the input");
            int userInput = sc.nextInt();
            NumberValidator.validateNumber(userInput);
            System.out.println("Number is valid: " + userInput);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
