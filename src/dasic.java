import java.util.Scanner;
import java.util.Arrays;
public class dasic {
    public static void main(String[] args) {

       /*for (int i =100;i>=1;i--){
            System.out.println(i);
        }
        int i =100;
        while(i>=1){
            System.out.println(i);
            i = i-1;
        }
        int k =100;
        do{
            System.out.println(k);
            k=k-1;
        }while(k>=1);
        */
        Scanner se = new Scanner(System.in);
        int number =0;
        do{
            System.out.println("input a number ");
            se.nextInt();
            System.out.println("Hare is your number: ");
            System.out.println(number);
        }while(number >=0);
        System.out.println("The end");
    }
}
