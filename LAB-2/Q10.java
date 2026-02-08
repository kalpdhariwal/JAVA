class Q10 {

    int a;

    int findSquare() {
        return a * a;
    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        obj.a = 6;

        int result = obj.findSquare();
        System.out.println("Square of number: " + result);
    }
}
