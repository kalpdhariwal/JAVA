class Q9 {

    int rollNo;
    String name;

    Q9(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Constructor:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    void setData(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Method:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Q9 s1 = new Q9(106, "Kalp");
        System.out.println();

        Q9 s2 = new Q9(106, "Kalp"); // dummy values
        s2.setData(106, "Dhariwal");
        s2.display();
    }
}
