class Vehicle {
    double fuelEfficiency() {
        return 0.0;
    }
}


class Car extends Vehicle {
    double fuelEfficiency() {
        return 15.5;
    }
}

class Bike extends Vehicle {
    double fuelEfficiency() {
        return 35.0;
    }
}

class Truck extends Vehicle {
    
    double fuelEfficiency() {
        return 8.0;
    }
}

public class Q3 {
    public static void main(String[] args) {

        
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Truck();

        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Fuel Efficiency: " + vehicles[i].fuelEfficiency());
        }
    }
}