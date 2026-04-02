class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
        System.out.println("Vehicle constructor: " + model);
    }
}

class Car extends Vehicle {

    Car(String model) {
        super(model); 
        System.out.println("Car constructor: " + model);
    }
}

class SportsCar extends Car {

    SportsCar(String model) {
        super(model);
        System.out.println("SportsCar constructor: " + model);
    }
}

public class Q2 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar("XUV 700");
        System.out.println("24BIT106 Kalp N Dhariwal");
        
    }
}