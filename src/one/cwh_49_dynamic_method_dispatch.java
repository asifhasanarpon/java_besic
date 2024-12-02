package one;//run time polymorphism

class Phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends Phone{
    public void on(){
        System.out.println("Turning on smartphone....");
    }
    public void music(){
        System.out.println("hello moto");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone  obj =new Phone();
        //obj.great();
        //Smartphone se = new Smartphone();
        Phone obj = new Smartphone();  //ei type e korle hobe kntu
        //Smartphone obj2 = new Phone(); //emn korle hobe na kaaron age phone the smartphone
        obj.on();
        obj.showTime();
        //obj.music(); //ei time e korle e allow hobe na
    }
}
