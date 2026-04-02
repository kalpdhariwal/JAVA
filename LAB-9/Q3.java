import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");

        } finally {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }

        sc.close();
    }
}