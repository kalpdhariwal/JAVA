class Vehicle {
    final String chassisNumber() {
        return "VH123";
    }
}

class Car extends Vehicle {
    String chassisNumber() {
        return "CAR456";
    }
}

public class Q5 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.chassisNumber());
    }
}