final class ElectricVehicle {

    void start() {
        System.out.println("Electric Vehicle is starting silently");
    }
}


class Tesla extends ElectricVehicle {
    void autopilot() {
        System.out.println("Tesla Autopilot enabled");
    }
}

public class Q6 {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle();
        ev.start();
    }
}