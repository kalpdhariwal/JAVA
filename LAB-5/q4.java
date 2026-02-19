class Course {
    String name;
    int code;

    Course(String courseName, int courseCode) {
        this.name = courseName;
        this.code = courseCode;
    }

    void displayDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Object Oriented Programming", 102);
        c1.displayDetails();

        System.out.println("24BIT106 Kalp N Dhariwal");
    }
}
