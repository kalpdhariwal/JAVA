public class Q3A {

    double x;

    Q3A() {
        x = 0;
    }

    Q3A(int a) {
        x = a;
    }

    Q3A(int a, int b) {
        x = a + b;
    }

    public static void main(String[] args) {
        Q3A Obj1 = new Q3A();
        Q3A Obj2 = new Q3A(10);
        Q3A Obj3 = new Q3A(10, 20);

        System.out.println("Obj1.x=" + Obj1.x +
                           "\nObj2.x=" + Obj2.x +
                           "\nObj3.x=" + Obj3.x);
    }
}
