package one;

interface Bicycle{
    int a = 45;//23 number line
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("hehe haha");
    }
    public void applyBrake(int decrement){//implement kora hoise
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        //You can create properties in Interfaces
        System.out.println(cycle.a);

    }
}
