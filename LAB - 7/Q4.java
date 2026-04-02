class vehicle
{
    final int MAX_SPEED = 200;

    void dis_speed()
    {
        System.out.println("Max Speed:"+MAX_SPEED);
    }
}

class car extends vehicle
{
    void car(int newspeed)
    {
        MAX_SPEED = newspeed;
    } 
}

public class Q4{
    public static void main(String[] args){
        car obj = new car();
    }
}