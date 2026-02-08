import java.util.Scanner;

class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("24BIT106 Kalp Dhariwal");
    }
}
