package one;

abstract class parent2{
    public parent2(){
        System.out.println("ami base1 er constructor");
    }
    public void sayHallo(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child2 extends parent2{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good afternoon");
    }
}
abstract class child3  extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        child2 c =new child2();
       // parent2 p = new parent2() abstract e object hoy na



    }

}

