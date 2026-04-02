import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");

        } finally {
            System.out.println("Division operation attempt is complete.");
        }

        sc.close();
    }
}