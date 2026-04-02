abstract class Shape {
    abstract double calculateArea();
}
class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea() {
        return length * breadth;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
public class Q1 {
        public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circ = new Circle(7);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Circle: " + circ.calculateArea());
        System.out.println("24BIT106 Kalp N Dhariwal");
    }
}