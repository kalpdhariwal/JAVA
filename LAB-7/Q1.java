class vehicle{
    public void start(){
        System.out.println("Vehicle starting");
    }
}
class car extends vehicle {
    public void start() {
        super.start();
        System.out.println("Car starting");
    }
}

public class Q1 {
    public static void main (String[] args)
    {
        car sc=new car ();
        sc.start();
        System.out.println("24BIT106 Kalp N Dhariwal");
    }
}