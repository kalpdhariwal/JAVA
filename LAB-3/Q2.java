class Students {
    int rollNo;
    String name;

    Students(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Q2 {

    public static void main(String[] args) {
        Students s1 = new Students(106, "Kalp");
    }
}
