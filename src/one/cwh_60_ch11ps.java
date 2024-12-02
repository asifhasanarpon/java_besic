package one;
//Create an abstract class pen with methods write() and refill() as abstract methods

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FounteinPen extends Pen{//1+2
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changNig(){
        System.out.println("Changing the nep");
    }
}

class Monkey {//3
    void jump() {
        System.out.println("Jumping.....");
    }

    void bite() {
        System.out.println(" Biting ....");
    }
}

interface BasicAnimal{//3
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println(" hello");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        FounteinPen p = new FounteinPen();//1+2
        p.refill();
        p.write();
        p.changNig();

        Human he = new Human();//3
        he.eat();
        he.sleep();

        Monkey m1 = new Human();//5
        m1.jump();
        m1.bite();
        //m1.speak();//==eita use kora jabe na karon monkey to speak korte pare na
        BasicAnimal ifty = new Human();
        ifty.eat();
        ifty.sleep();
    }
}
