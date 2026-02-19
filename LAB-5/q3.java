public class q3 {
    void add(double a, int b) {
        System.out.println(a + b);
    }

    void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        q3 ob1 = new q3();
        q3 ob2 = new q3();

        ob1.add(2.4, 10);
        ob1.add(5, 7.5);

        System.out.println("Kalp N Dhariwal 24BIT106");
    }
}
