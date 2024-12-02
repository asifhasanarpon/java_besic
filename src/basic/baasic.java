package basic;

import java.util.Scanner;
import java.util.Arrays;
public class baasic {
    public static void printJava() {// methods e kaje lagse**1
        System.out.println("Hello java");
    }
    public static void printName(String name){//2
        System.out.println(name);
    }
    public static void printSome(int a, int b){//3
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {

       /*for (int i = 100;i >= 1;i--) {
            System.out.println(i);
        }
        int i = 100;
        while(i >= 1) {
            System.out.println(i);
            i = i - 1;
        }

        int k = 100;
        do {
            System.out.println(k);
            k = k - 1;
        }while(k >= 1);

        //do while loop er kaj
        Scanner se = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("input a number ");
            number = se.nextInt();
            System.out.print("Hare is your number: ");
            System.out.println(number);
        }while(number >= 0);
        System.out.println("The end");

        //break and continue
        int i =0;
        while(true) {
            if(i == 3){//eikhan e output e 3 bad jabe and baki gula print hobe
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i>5) {
                break;
            }
        }


        //TRY -CATCH IN EXCEPTION HANDLING
        int [] marks ={56,67,78};//exception hoilo ekta jinsih jodi vul houar somvobona thake tokhn try use kore oi  confusion ta oitar vitore dhukai diye baki output print kora
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {

        }
        System.out.println("this name is pps");

        //METHODS**
        printJava();//1
        printName("ifty");//2
        printSome(1,4);//3

        */
        //MINI PROJECT
        int userNumber;
        int myNumber= (int)(Math.random()*100);
        Scanner se = new Scanner(System.in);
        do {
            System.out.println("Guess the number : ");
            userNumber = se.nextInt();
            if(userNumber == myNumber) {
                System.out.println("woohoo..correct number!!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is large");
            }
            else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >=0);
        System.out.println("My number was :");
        System.out.println(myNumber);
    }
}

