public class Q3B {

    double x;

    Q3B() {
        x = 0;
    }

    Q3B(int a) {
        x = a;
    }

    Q3B(double a) {
        x = a;
    }

    public static void main(String[] args) {
        Q3B Obj1 = new Q3B();
        Q3B Obj2 = new Q3B(10);
        Q3B Obj3 = new Q3B(20.4);

        System.out.println("Obj1.x=" + Obj1.x +
                           "\nObj2.x=" + Obj2.x +
                           "\nObj3.x=" + Obj3.x);
    }
}
