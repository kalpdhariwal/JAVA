public class q1 {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        q1 ob1 = new q1();
        q1 ob2 = new q1();

        ob1.add(5, 15);
        ob1.add(5, 10, 15);

        System.out.println("Kalp N Dhariwal 24BIT106");
    }
}
