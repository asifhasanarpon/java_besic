package one;


class c1 {
    public int x = 5;
    protected int y=45;
    int z = 53;
    private int a = 54;
    public void me1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class cwh_66_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        //c.me1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
       // System.out.println(c.a);// a privet thakar jonno eitaa run hobe na

    }
}
