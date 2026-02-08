class Q11 {

    String name;
    int age;

    void display(Q11 s) {
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }

    public static void main(String[] args) {
        Q11 obj = new Q11();
        obj.name = "Kalp";
        obj.age = 19;

        obj.display(obj);
    }
}
