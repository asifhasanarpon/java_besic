package one;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class cwh_58_inheritance_interfaces {
    public static void main(String[] args) {
        MySampleClass ge = new MySampleClass();
        ge.meth1();
        ge.meth2();
        ge.meth3();
        ge.meth4();
    }
}
