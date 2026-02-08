class Q8 {

    int a;

    void checkNumber() {
        if (a > 0)
            System.out.println("Number is Positive");
        else if (a < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        obj.a = -1;

        obj.checkNumber();
    }
}
