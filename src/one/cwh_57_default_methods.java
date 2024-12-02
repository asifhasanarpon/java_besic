package one;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String Network);
}

class MyCallPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..!");
    }
}

class MySmartphone extends MyCallPhone implements MyWifi , MyCamera{
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
    public void connectToNetwork(String network){
        System.out.println("connecting  to "+ network);
    }
}

public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartphone se = new MySmartphone();
        String[] ar = se.getNetwork();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
