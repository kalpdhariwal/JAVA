public class Q7 {

    public static void main(String[] args) {

        int i;
        int sum = 0;

        for (i = 11; i < 950; i++) {
            if (i % 18 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("24BIT106 Kalp Dhariwal");
    }
}
