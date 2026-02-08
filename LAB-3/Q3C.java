public class Q3C {

    double x;

    Q3C() {
        x = 0;
    }

    Q3C(int a, double b) {
        x = a + b;
    }

    Q3C(double a, int b) {
        x = a + b;
    }

    public static void main(String[] args) {
        Q3C Obj1 = new Q3C();
        Q3C Obj2 = new Q3C(10, 20.4);
        Q3C Obj3 = new Q3C(13.6, 10);

        System.out.println("Obj1.x=" + Obj1.x +
                           "\nObj2.x=" + Obj2.x +
                           "\nObj3.x=" + Obj3.x);
    }
}
