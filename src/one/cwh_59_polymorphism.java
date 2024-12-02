package one;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k .....");
    }
}

interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork2(String Network);
}

class MyCallPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..!");
    }
}

class MySmartphone2 extends MyCallPhone2 implements MyWifi2 , MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of network");
        String[] networkList = {"Asif", "Foysal" , "Ifty"};
        return networkList;
    }
    public void connectToNetwork2(String network){
        System.out.println("connecting  to "+ network);
    }
    public void sampleMethod(){
        System.out.println("meth");
    }
}

public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartphone2(); //eita smartphone er kntu camara er material add korte hobe nahole error dekhabe
        //cam1.getNetwork // == not allowed
        cam1.record4kVideo();

        MySmartphone2 s2 = new MySmartphone2();
        s2.sampleMethod();
        s2.getNetwork();
        s2.connectToNetwork2("ed");
        s2.callNumber(344334434);


    }
}
