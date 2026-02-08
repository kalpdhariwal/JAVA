class Student {
    String name;
    int roll_no;

    static void display(Student obj) {
        System.out.println(obj.name + ", " + obj.roll_no);
    }
}

public class Q5 {

    public static void main(String[] args) {
        Student obj = new Student();

        obj.name = "Kalp Dhariwal";
        obj.roll_no = 106;

        Student.display(obj);

        System.out.println("Kalp Dhariwal 24BIT106");
    }
}
