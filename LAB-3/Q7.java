class Q7 {

    int rollNo;
    String name;

    Q7(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;

        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Q7 s1 = new Q7(106, "Kalp");
    }
}
