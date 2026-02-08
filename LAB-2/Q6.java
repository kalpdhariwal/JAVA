class Q6 {

    int length;
    int width;

    int Area() {
        return length * width;
    }

    public static void main(String[] args) {
        Q6 rect = new Q6();

        rect.length = 10;
        rect.width = 5;

        System.out.println("Area:" + rect.Area());
    }
}
