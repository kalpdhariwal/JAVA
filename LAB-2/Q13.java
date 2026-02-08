class Q13 {

    int rollNo;
    String name;
    int marks;

    void setDetails(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Q13 students[] = new Q13[3];

        students[0] = new Q13();
        students[1] = new Q13();
        students[2] = new Q13();

        students[0].setDetails(1, "Amit", 85);
        students[1].setDetails(2, "Neha", 90);
        students[2].setDetails(3, "Rahul", 78);

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }
}
