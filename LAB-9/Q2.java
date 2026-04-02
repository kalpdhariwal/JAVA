import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Voter v = new Voter();

        try {
            v.validateAge(age);
            System.out.println("Valid age - eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: must be 18 or older");
        } finally {
            System.out.println("Age verification completed");
        }

        sc.close();
    }
}