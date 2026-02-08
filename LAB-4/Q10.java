public class Q10 {

    public static void main(String[] args) {

        int i, n, count;
        int primeCount = 0;

        for (n = 1; n <= 1000; n++) {
            count = 0;

            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n);
                primeCount++;
            }
        }

        System.out.println("Total prime numbers = " + primeCount);
        System.out.println("24BIT106 Kalp Dhariwal");
    }
}
